class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String str[] = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		HashSet<String> h = new HashSet<>();
		for (String c : words) {
			StringBuilder s = new StringBuilder();
			for (char c1 : c.toCharArray()) {
				s.append(str[c1 - 'a']);
			}
			h.add(s.toString());
		}
		return h.size();
    }
}
