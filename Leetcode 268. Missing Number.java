class Solution {
    public int missingNumber(int[] nums) {
        int res=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        res=(nums.length*(nums.length+1))/2;
        return res-sum;
    }
}
