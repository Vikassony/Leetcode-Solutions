class Solution {
    public String mergeAlternately(String word1, String word2) {
        char ch[] = new char[word1.length()+word2.length()];
        int i=0,j=0,k=0;
        while(i<word1.length() && j<word2.length())
        {
            ch[k]=word1.charAt(i);
            i++;
            k++;
            ch[k]=word2.charAt(j);
            k++;
            j++;
        }
        while(i<word1.length())
        {
            ch[k]=word1.charAt(i);
            i++;
            k++;
        }
        while(j<word2.length())
        {
            ch[k]=word2.charAt(j);
            j++;
            k++;
        }
        String res="";
        for( i=0;i<ch.length;i++)
            res+=Character.toString(ch[i]);
        return res;
    }
}
