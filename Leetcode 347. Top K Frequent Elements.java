class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> hm = new HashMap<>();
		int res[] = new int[k];
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i]))
				hm.put(nums[i], hm.get(nums[i]) + 1);
			else
				hm.put(nums[i], 1);
		}
		HashMap<Integer, Integer> h = sortByValue(hm);
		int l = 0, count = 0;

		for (Integer i : h.keySet()) {
			if (count >= h.size() - k) {
				res[l++] = i;
			}
			count++;
		}
		return res;

	}

	public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) {
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
}
