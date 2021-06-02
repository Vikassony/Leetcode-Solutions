class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
		String s1 = "";
		for (int i = 0; i < str.length; i++) {
			s1 += reverse(str[i]);
            if (i != str.length - 1)
			s1 += " ";
		}
        return s1;
    }
    public  String reverse(String str) {
        //1. Method	
        // StringBuffer sb = new StringBuffer(str);
		// sb.reverse();
		// return sb.toString();
        
        //2.Method
        //String s="";
        // for(int i=str.length()-1;i>=0;i--)
        // {
        //     s+=str.charAt(i);
        // }
        // return s;
           
        //3.Method
        char ch[] = str.toCharArray();
		String s = "";
		int i = 0, j = str.length() - 1;
		while (i < j) {
			char c = ch[i];
			ch[i] = ch[j];
			ch[j] = c;
			i++;
			j--;
		}
		for (i = 0; i < ch.length; i++)
			s += Character.toString(ch[i]);
		return s;	
    }
}
