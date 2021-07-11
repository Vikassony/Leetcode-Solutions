class Solution {
    public String freqAlphabets(String s) {
        StringBuffer res = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '#') {
				int x = Integer.parseInt(s.substring(i - 2, i));
				res.append(Character.toString((char) (x + 96)));
				i-=2;
			} else {
				int x = s.charAt(i)-'0';
				res.append(Character.toString((char) (x + 96)));
			}
		}
        return res.reverse().toString();
    }
}
