class Solution {
    public double myPow(double x, int n) {
       double k=0;
        if(n>0)
        {
            k=pow(x, n);
        }else
        {
            double L=pow(x, n);
            k=1/L;
        } 
        return k;
    }
    public double pow(double x, int n) {
        if(n==0)
            return 1;
    double k=pow(x, n/2);
    double r=k*k;
    if(n%2!=0)
        r=x*r;
    return r;
    } 
}
