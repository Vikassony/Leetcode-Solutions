class Solution {
    public int uniquePaths(int m, int n) {
        if(n==1 || m==1)
            return 1;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    dp[i][j]=1;
                }
                else if(j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
