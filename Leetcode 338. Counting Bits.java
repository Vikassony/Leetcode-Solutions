class Solution {
	public int[] countBits(int n) {
		int[] res = new int[n + 1];
		res[0] = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int k = i;
			count = 0;
			while (k != 0) {
				int x = k % 2;
				if (x == 1)
					count++;
				k /= 2;
			}
			res[i] = count;
		}
		return res;
	}
}
