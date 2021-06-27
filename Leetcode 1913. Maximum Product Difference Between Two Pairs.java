class Solution {
	public int maxProductDifference(int[] nums) {
		int l = 0, sl = 0, s = Integer.MAX_VALUE, ss = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= l) {
				sl = l;
				l = nums[i];
			} else if (nums[i] > sl) {
				sl = nums[i];
			}
			if (nums[i] < s) {
				ss = s;
				s = nums[i];
			} else if (nums[i] < ss) {
				ss = nums[i];
			}
		}
		return (l * sl) - (s * ss);
	}
}
