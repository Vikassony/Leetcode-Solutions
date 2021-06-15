class Solution {
    public String restoreString(String s, int[] indices) {
        String res[] = new String[s.length()];
        char ch[]=s.toCharArray();
        String r="";
        for(int i=0;i<indices.length;i++)
        {
            res[indices[i]]=Character.toString(ch[i]);
        }
        for(int i=0;i<res.length;i++)
            r+=res[i];
        return r;
    }
}
