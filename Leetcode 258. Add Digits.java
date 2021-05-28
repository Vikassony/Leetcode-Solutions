class Solution {
    public int addDigits(int num) {
        if(num<10)
            return num;
        while(num>9)
        {
               num=sum(num);                 
        }
        return num;
    }
    public int sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int r=n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
}
