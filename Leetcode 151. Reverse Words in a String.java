class Solution {
	public String reverseWords(String s) {
		int count = 0, l = 0;
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				res += Character.toString(s.charAt(i));
				l = 1;
				count = 0;
			} else if (l == 1) {
				count++;
				if (count == 1)
					res += " ";
			}
		}
		s = "";
		String s1[] = res.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {
			s += s1[i];
			s += " ";
		}
		return s.trim();
	}
}
