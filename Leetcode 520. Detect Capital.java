class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)>='A' && word.charAt(i)<='Z')
                count++;
        }
        if(count==word.length())
            return true;
        count=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)>='a' && word.charAt(i)<='z')
                count++;
        }
        if(count==word.length())
            return true;
        int c1=0;
        count=0;
        for(int i=0;i<word.length();i++)
        {
            if(i==0 && word.charAt(i)>='A' && word.charAt(i)<='Z')
                c1=1;
            if(word.charAt(i)>='a' && word.charAt(i)<='z')
                count++;
        }
        if(c1==1 && count==word.length()-1)
            return true;
        return false;
    }
}
