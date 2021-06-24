class Solution {
   public static String mostCommonWord(String paragraph, String[] banned) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String res = "", ban = "";
		paragraph = paragraph.replaceAll("[^a-zA-Z0-9]", " ");
		paragraph = paragraph.replaceAll("  ", " ");
		paragraph = paragraph.toLowerCase();
		System.out.println(paragraph);
		for (int i = 0; i < banned.length; i++)
			ban += banned[i];
		String s[] = paragraph.split(" ");
		for (int i = 0; i < s.length; i++) {
			if (!(ban.contains(s[i])) && hm.containsKey(s[i])) {
				hm.put(s[i], hm.get(s[i]) + 1);
			} else if (!(ban.contains(s[i])) && !(hm.containsKey(s[i]))) {
				hm.put(s[i], 1);
			}
		}
		int max = 0;
		String r = "";
		for (String i : hm.keySet()) {
			if (hm.get(i) > max) {
				max = hm.get(i);
				r = i;
			}
		}
		return r;
	}
}
