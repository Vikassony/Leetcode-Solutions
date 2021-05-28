class Solution {
    public boolean isPowerOfThree(int n) {
        int count=0;
        for(int i=0;i<=Math.cbrt(n);i++)
        {
            if(n==Math.pow(3,count))
                return true;
            else
                count++;
        }
        return false;
    }
}
