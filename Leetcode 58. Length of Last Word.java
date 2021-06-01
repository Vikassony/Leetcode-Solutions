class Solution {
    public int lengthOfLastWord(String s) {
        int count=0,c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
                c++;
            else 
                break;
        }
        for(int i=s.length()-1-c;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
                count++;
            else break;
        }
        return count;
    }
}
