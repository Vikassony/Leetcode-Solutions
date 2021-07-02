class Solution {
	public int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (allowed.length() >= words[i].length() && check(allowed, words[i]))
				count++;
			else if (allowed.length() <= words[i].length() && check(allowed, words[i]))
				count++;
		}
		return count;
	}

	public boolean check(String s1, String s2) {
		for (int i = 0; i < s2.length(); i++) {
			if (s1.contains(Character.toString(s2.charAt(i))) == false)
				return false;
		}
		return true;
	}
}
