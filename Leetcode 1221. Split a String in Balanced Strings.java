class Solution {
    public int balancedStringSplit(String s) {
        int L = 0, R = 0, ans = 0;
		for (char c : s.toCharArray()) {
			if (c == 'L')
				L++;
			else
				R++;
			if (L == R)
				ans++;
		}
		return ans;
    }
}
