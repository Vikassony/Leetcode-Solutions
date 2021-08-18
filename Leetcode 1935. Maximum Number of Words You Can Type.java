class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String str[] = text.split(" ");
        for(int i=0;i<str.length;i++){
            String s=str[i];
            for(char ch: brokenLetters.toCharArray()){
                if(s.contains(Character.toString(ch)))
                {count++;
                break;
                }
            }
        }
        return str.length-count;
    }
}
