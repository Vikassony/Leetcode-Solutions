class Solution {
    public int getLucky(String s, int k) {
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int x=ch-96;
            res+=Integer.toString(x);
        }
        String su=res;
        for(int i=0;i<k;i++){
            su=sum(su);
        }
        return Integer.parseInt(su);
    }
    public String sum(String s){
        int su=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            su+=ch-'0';
        }
        return Integer.toString(su);
    }
}
