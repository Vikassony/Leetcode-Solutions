class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1,sum=0;
        while(n!=0)
        {
            int k=n%10;
            pro*=k;
            sum+=k;
            n/=10;
        }
        return pro-sum;
    }
}
