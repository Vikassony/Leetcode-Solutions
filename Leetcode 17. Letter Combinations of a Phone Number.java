class Solution {
    String[] sa = new String[] { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    int count=0;
    public List<String> letterCombinations(String digits) {
        List<String> rr = new ArrayList<>();
        if (digits.length() == 0) {
            if(count==0)
			return rr;
            rr.add("");
            return rr;
		}
        count++;
		char ch = digits.charAt(0);
		String str = digits.substring(1);
		List<String> rrs = letterCombinations(str);
		ArrayList<String> al = new ArrayList<String>();
		String s1 = sa[ch - '0' - 1];
		for (int i = 0; i < s1.length(); i++) {
			char ch1 = s1.charAt(i);
			for (String s2 : rrs) {
				al.add(ch1 + s2);
			}
		}
		return al;
    }
}
