class Solution {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int res[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			res[i] = check(nums[i], nums);
		}
		return res;
	}

	public int check(int x, int nums[]) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (x > nums[i])
				count++;
		}
		return count;
	}
}
