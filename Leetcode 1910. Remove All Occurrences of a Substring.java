class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuffer sb = new StringBuffer(s);
        while(s.contains(part))
        {
            int i=s.indexOf(part);
            sb.delete(i,i+part.length());
            s=sb.toString();
        }
        return s;
    }
}
