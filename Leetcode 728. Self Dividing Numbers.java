class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            if(check(i))
                al.add(i);
        }
        return al;
    }
    public boolean check(int n)
    {
        int x=n;
        while(n!=0)
        {
            int k=n%10;
            if(k==0)
                return false;
            else if(x%k!=0)
                return false;
            else
                n/=10;
        }
        return true;
    }
}
