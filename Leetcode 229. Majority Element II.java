class Solution {
	public List<Integer> majorityElement(int[] nums) {
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				int ov = hm.get(nums[i]);
				int nv = ov + 1;
				hm.put(nums[i], nv);
			} else {
				hm.put(nums[i], 1);
			}
		}
		int max = nums.length / 3;
		for (Integer i : hm.keySet()) {
			if (hm.get(i) > max)
				al.add(i);
		}
		return al;
	}
}
