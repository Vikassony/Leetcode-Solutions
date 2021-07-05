class Solution {
    public int totalMoney(int n) {
        int count=0,m=1,k=0;
        for(int i=1;i<=n;i++)
        {
            if(count==7)
            {
               m++;
                count=0;
            }  
            k += count++ + m;
        }
        return k;
    }
}
