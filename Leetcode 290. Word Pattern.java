class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.split("").length!=s.split(" ").length)
            return false;
        HashMap<Character,String> hm1 = new HashMap<>();
        HashMap<String,Character> hm2 = new HashMap<>();
        String st[] = s.split(" ");
        for(int i=0;i<pattern.length();i++)
        {
            Character s1=pattern.charAt(i);
            String s2=st[i];
            if(!hm1.containsKey(s1) && !hm2.containsKey(s2))
            {
                hm1.put(s1,s2);
                hm2.put(s2,s1);
            }
            else if(hm1.get(s1)!=s2 && hm2.get(s2)!=s1)
                return false;
        }
        return true;
    }
}
