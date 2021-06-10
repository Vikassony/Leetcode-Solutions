class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ali = new ArrayList<Integer>();
        ArrayList<Integer> ale = new ArrayList<Integer>();
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
        // for(Integer i : nums1)
        // {
        //     ali.add(i);
        // }
        // for(Integer i : nums2)
        // {
        //     if(ali.contains(i))
        //     {
        //         ale.add(i);
        //         ali.remove(i);
        //     }
        // }
        int res[] = new int[ale.size()];
        int k=0;
        for(int x: ale)
            res[k++]=x;
        return res;
    }
}
