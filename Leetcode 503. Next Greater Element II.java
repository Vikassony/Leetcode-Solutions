class Solution {
    public int[] nextGreaterElements(int[] nums) {
    int a[] = new int[nums.length + nums.length];
		int b[] = new int[nums.length];
		int res = 0, k = 0, l = 0;
		for (int i = 0; i < nums.length * 2; i++) {
			if (i < nums.length)
				a[k++] = nums[l++];
			else
				a[k++] = nums[h++];
		}
		k = 0;
		l = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < a.length; j++) {
				res = nums[i];
				if (res < a[j]) {
					b[k++] = a[j];
					l = 1;
					break;
				}
			}
			if (l != 1)
				b[k++] = -1;
			l = 0;
		}
		return b;
	}
}
