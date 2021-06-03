class Solution {
	public int trailingZeroes(int n) {
		int temp=n;
        int count=0;
        while(temp!=0)
        {
            count+=temp/5;
            temp/=5;
        }
        return count;
	}
}
