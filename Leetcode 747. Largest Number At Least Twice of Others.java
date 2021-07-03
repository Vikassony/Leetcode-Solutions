class Solution {
	public int dominantIndex(int[] nums) {
		if (nums.length == 1 && (nums[0] == 0 || nums[0] == 1))
			return 0;
		int lar = nums[0], index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > lar) {
				lar = nums[i];
				index = i;
			}
		}
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (lar >= nums[i] * 2)
				count++;
		}
		if (count == nums.length - 1)
			return index;
		else
			return -1;
	}
}
