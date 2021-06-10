class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ali = new ArrayList<Integer>();
		HashSet<Integer> ale = new HashSet<Integer>();
		int p = 0;
		for (int i = 0; i < nums1.length; i++) {
			p = 0;
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j] && ali.contains(j) == false) {
					ale.add(nums1[i]);
					ali.add(j);
					p = 1;
				}
				if (p == 1)
					break;
			}
        }
		int res[] = new int[ale.size()];
		int k = 0;
		for (int x : ale)
			res[k++] = x;
		return res;
    }
}
