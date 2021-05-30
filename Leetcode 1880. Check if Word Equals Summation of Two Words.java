class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int count = 0, p = 1;
		for (int i = firstWord.length() - 1; i >= 0; i--) {
			int x = firstWord.charAt(i) - 'a';
			count += x * p;
			p *= 10;
		}
		p = 1;
		int count1 = 0;
		for (int i = secondWord.length() - 1; i >= 0; i--) {
			int x = secondWord.charAt(i) - 'a';
			count1 += x * p;
			p *= 10;
		}
		p = 1;
		int count2 = 0;
		for (int i = targetWord.length() - 1; i >= 0; i--) {
			int x = targetWord.charAt(i) - 'a';
			count2 += x * p;
			p *= 10;
		}
		if (count + count1 == count2)
			return true;
		else
			return false;
    }
}
