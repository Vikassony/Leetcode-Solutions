class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				int ov = hm.get(s.charAt(i));
				int nv = ov + 1;
				hm.put(s.charAt(i), nv);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		char ch = ' ';
		for (Character i : hm.keySet()) {
			if (hm.get(i) == 1) {
				ch = i;
				break;
			}

		}
		return s.indexOf(ch);
    }
}
