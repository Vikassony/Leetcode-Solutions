class Solution {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		TreeMap<Integer, Integer> hm = new TreeMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (hm.containsKey(arr1[i])) {
				hm.put(arr1[i], hm.get(arr1[i]) + 1);
			} else
				hm.put(arr1[i], 1);
		}
		int res[] = new int[arr1.length];
		int l = 0;
		for (int i : arr2) {
			int x = hm.get(i);
			for (int k = 0; k < x; k++)
				res[l++] = i;
			hm.put(i, -11);
		}
		for (Integer i : hm.keySet()) {
			if (hm.get(i) != -11) {
				int x = hm.get(i);
				for (int k = 0; k < x; k++)
					res[l++] = i;
			}
		}
		return res;
	}
}
