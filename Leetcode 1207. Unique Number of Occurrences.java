import java.util.Collection;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				int ov = hm.get(arr[i]);
				int nv = ov + 1;
				hm.put(arr[i], nv);
			} else {
				hm.put(arr[i], 1);
			}
		}
		Set<Integer> al = new HashSet<>();
		Collection<Integer> getValues = hm.values();
		Iterator<Integer> itr = getValues.iterator();
		while (itr.hasNext()) {
			al.add((Integer) itr.next());
		}
		if (al.size() == hm.size())
			return true;
		return false;
    }
}
