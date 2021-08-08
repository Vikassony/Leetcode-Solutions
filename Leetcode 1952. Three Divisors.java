class Solution {
    public boolean isThree(int n) {
        int i=0;
        for( i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                break;
        }
        if(i!=Math.sqrt(n))
            return false;
        return true;
    }
}
