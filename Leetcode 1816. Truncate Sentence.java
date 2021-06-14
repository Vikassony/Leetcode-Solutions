class Solution {
    public String truncateSentence(String s, int k) {
       String s1[] = s.split(" ");
        String s2[] = new String[k];
        for(int i=0;i<k;i++)
        {
            s2[i]=s1[i];
        }
        String res="";
        for(int i=0;i<s2.length;i++)
        {
            res+=s2[i];
            res+=" ";
        }
        return res.trim();
    }
}
