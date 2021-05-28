class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n%2!=0)
            return false;
        int count=1;
        for(int i=0;i<=Math.sqrt(n);i++)
        {
            if(Math.pow(2,count)==n)
                return true;
            else
                count++;
        }
        return false;
    }
}
