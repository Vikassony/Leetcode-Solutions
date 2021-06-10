class Solution {
	public boolean areAlmostEqual(String s1, String s2) {
		if (s1.equals(s2))
			return true;
		if (s1.length() != s2.length())
			return false;
		char c1 = ' ', c2 = ' ';
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(i) - 'a') != (s2.charAt(i) - 'a'))
				count1++;
		}
		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(i) - 'a') != (s2.charAt(i) - 'a')) {
				if (count2 == 0) {
					c1 = s1.charAt(i);
					c2 = s2.charAt(i);
					count2++;
				} else if (c1 == s2.charAt(i) && c2 == s1.charAt(i)) {
					count2++;
				} else
					break;
			}
		}
		if (count1 == 2 && count2 == 2)
			return true;
		return false;
	}
}
