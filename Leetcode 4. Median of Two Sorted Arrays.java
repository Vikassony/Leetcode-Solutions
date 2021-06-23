class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int res[] = new int[nums1.length + nums2.length];
		int i = 0, j = 0, k = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] > nums2[j]) {
				res[k++] = nums2[j++];
			} else
				res[k++] = nums1[i++];
		}
		while (i < nums1.length)
			res[k++] = nums1[i++];
		while (j < nums2.length)
			res[k++] = nums2[j++];
		double d;
		if (res.length % 2 != 0)
			d = res[res.length / 2];
		else{
		    double x=res[res.length / 2];
            double y = res[(res.length / 2) - 1];
            d=(x+y)/2;
        }
		return d;
	}
}
