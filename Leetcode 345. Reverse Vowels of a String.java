class Solution {
    public String reverseVowels(String s) {
       char ch[] = s.toCharArray();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (!isVowel(ch[i]))
				i++;
			if (!isVowel(ch[j]))
				j--;
			if (isVowel(ch[i]) && isVowel(ch[j])) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
                i++;
                j--;
			}
		}
        return String.valueOf(ch);
	}

	public  boolean isVowel(char ch) {
		if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U'))
			return true;
		return false;
	} 
    }
