class Solution {
	public int maxProduct(String[] words) {
		int max = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (check(words[i], words[j])) {
					int k = words[i].length() * words[j].length();
					if (k > max)
						max = k;
				}
			}
		}
		return max;
	}

	public boolean check(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (s2.contains(Character.toString(s1.charAt(i))))
				return false;
		}
		return true;
	}
}
