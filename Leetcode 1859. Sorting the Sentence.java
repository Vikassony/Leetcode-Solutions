class Solution {
    public String sortSentence(String s) {
       String s1[] = s.split(" ");
		String s2[] = new String[s1.length];
		for (int i = 0; i < s1.length; i++) {
			String s3 = s1[i];
			int k = s3.charAt(s3.length() - 1) - '0';
			s2[k - 1] = s3;
		}
		String res = "";
		for (int i = 0; i < s2.length; i++) {
			String s4 = s2[i];
			res += s4.substring(0, s4.length() - 1);
			res += " ";
		}
		return res.trim();
    }
}
