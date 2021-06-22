class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
            return false;
        int res[] = new int[27];
        for(int i=0;i<sentence.length();i++)
        {
            res[sentence.charAt(i)-96]++;
        }
        for(int i=1;i<res.length;i++)
        {
            if(res[i]==0)
                return false;
        }
        return true;
    }
}
