class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> al =new ArrayList<>();
        int res[] = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                al.add(i);
        }
        for(int i=0;i<s.length();i++)
        {
            res[i]=getI(i,al);
        }
        return res;
    }
    public int getI(int k , ArrayList<Integer> al)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++)
        {
            if(Math.abs(al.get(i)-k)<min)
                min=Math.abs(al.get(i)-k);
        }
        return min;
    }
}
