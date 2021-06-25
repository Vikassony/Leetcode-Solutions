//Euclid-Euler formula for finding the perferct number Math.pow(2,p-1)*(Math.pow(2,p)-1) where (Math.pow(2,p)-1) should be prime.
class Solution {
	public boolean checkPerfectNumber(int num) {
		int p = 1;
		while (true) {
			int k = (int) Math.pow(2, p - 1);
			int l = (int) Math.pow(2, p);
			if (prime(l - 1)) {
				if (k * (l - 1) == num)
					return true;
			}
			if (k * (l - 1) > num)
				break;
			p++;
		}
		return false;
	}

	public boolean prime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

