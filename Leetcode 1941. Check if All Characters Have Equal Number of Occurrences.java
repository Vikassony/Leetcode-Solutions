class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        int temp=hm.get(s.charAt(0));
        for(char c : hm.keySet())
        {
            if(temp!=hm.get(c))
                return false;
        }
        return true;
    }
}
