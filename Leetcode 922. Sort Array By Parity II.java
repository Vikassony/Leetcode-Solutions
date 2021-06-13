class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        if (nums.length == 1)
			return nums;
		int a[] = new int[nums.length / 2];
		int b[] = new int[nums.length / 2];
		int k = 0, j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				a[k++] = nums[i];
			} else
				b[j++] = nums[i];
		}
		k = 0;
		for (int i = 0; i < nums.length; i += 2) {
			nums[i] = a[k++];
		}
		k = 0;
		for (int i = 1; i < nums.length; i += 2) {
			nums[i] = b[k++];
		}
		return nums;
    }
}
