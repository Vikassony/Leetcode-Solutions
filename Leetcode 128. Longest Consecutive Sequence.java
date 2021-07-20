class Solution {
	public int longestConsecutive(int[] nums) {
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], true);
		}
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i] - 1))
				hm.put(nums[i], false);
		}
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int k = 0, l = 0;
			if (hm.get(nums[i]) == true) {
				int p = nums[i];
				while (hm.containsKey(p)) {
					p++;
					k++;
					if (k > res)
						res = k;
				}
			}
		}
		return res;
	}
}
