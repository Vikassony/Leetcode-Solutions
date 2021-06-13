class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pn0 = 1, pn1 = 1, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				count++;
		}
		int a[] = new int[nums.length];
		if (count == 0) {
			for (int i = 0; i < nums.length; i++) {
				pn0 *= nums[i];
			}
			for (int i = 0; i < nums.length; i++) {
				int k = pn0 / nums[i];
				a[i] = k;
			}
		} else if (count == 1) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != 0)
					pn1 *= nums[i];
			}
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 0)
					a[i] = pn1;
				else
					a[i] = 0;
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				a[i] = 0;
			}
		}
		return a;
    }
}
