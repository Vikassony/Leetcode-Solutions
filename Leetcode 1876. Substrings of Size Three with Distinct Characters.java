class Solution {
    public int countGoodSubstrings(String s) {
        ArrayList<String> al = new ArrayList<>();
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            al.add(s.substring(i,i+3));
            if(check(al.get(i)))
                count++;
        }
        return count;
    }
    public boolean check(String s)
    {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            hs.add(s.charAt(i));
        }
        if(hs.size()==s.length())
            return true;
        return false;
    }
}
