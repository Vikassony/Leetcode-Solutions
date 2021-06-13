class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0, j = s.length() - 1;
		char[] ch = s.toCharArray();
		while (i < j) {
			if (((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))
					&& ((ch[j] >= 'a' && ch[j] <= 'z') || (ch[j] >= 'A' && ch[j] <= 'Z'))) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
			if (!((ch[j] >= 'a' && ch[j] <= 'z') || (ch[j] >= 'A' && ch[j] <= 'Z'))) {
				j--;
			}
			if (!((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')))
				i++;
		}
		String res = "";
		for (i = 0; i < ch.length; i++)
			res += Character.toString(ch[i]);
		return res;
    }
}
