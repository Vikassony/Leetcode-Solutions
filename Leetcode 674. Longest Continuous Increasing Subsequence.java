class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1,max=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                count++;
                if(count>max)
                    max=count;
            }
            else
                count=1;
        }
        return max;
    }
}
