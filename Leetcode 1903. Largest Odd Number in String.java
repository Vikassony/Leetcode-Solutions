class Solution {
    public String largestOddNumber(String num) {
        StringBuffer sb = new StringBuffer(num);
        for(int i=sb.length()-1;i>=0;i--)
        {
            if((sb.charAt(i)-48)%2==0)
                sb.deleteCharAt(i);
            else
                return sb.toString();
        }
        return "";
    }
}
