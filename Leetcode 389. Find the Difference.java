class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0,sum1=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=(int)s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            sum1+=(int)t.charAt(i);
        }
        int res=sum-sum1;
        if(res<0)
            res= -(res);
        char c=(char)res;
        return c;
    }
}
