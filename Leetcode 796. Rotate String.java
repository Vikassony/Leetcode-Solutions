class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal))
            return true;
        for(int i=0;i<s.length()-1;i++)
        {
            s=rotate(s);
            if(s.equals(goal))
                return true;
        }
        return false;
    }
    public String rotate(String s)
    {
        char ch[]=s.toCharArray();
        char f=ch[0];
        for(int i=0;i<ch.length-1;i++)
            ch[i]=ch[i+1];
        ch[ch.length-1]=f;
        String res="";
        for(int i=0;i<ch.length;i++)
            res+=Character.toString(ch[i]);
        return res;
    }
}
