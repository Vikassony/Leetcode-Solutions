class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1])
            return nums.length;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i] || target <nums[i])
            {
                k=i;
                break;
            }
        }
        return k;
    }
}
