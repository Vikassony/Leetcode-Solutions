class Solution {
    public int[][] generateMatrix(int n) {
        int res[][]= new int[n][n];
		int count = 0;
        int c1=0;
		int tle = n * n;
		int minr = 0, minc = 0, maxc = n - 1, maxr = n - 1;
		while (count < tle) {
			for (int i = minc, j = minr; i <= maxc && count < tle; i++) {
				res[j][i]=++c1;
				count++;
			}
			minr++;
			for (int i = minr, j = maxc; i <= maxr && count < tle; i++) {
				res[i][j]=++c1;
				count++;
			}
			maxc--;
			for (int i = maxc, j = maxr; i >= minc && count < tle; i--) {
				res[j][i]=++c1;
				count++;
			}
			maxr--;
			for (int i = maxr, j = minc; i>=minr && count<tle; i--) {
				res[i][j]=++c1;
				count++;
			}
			minc++;
		}
        return res;
        
    }
}
