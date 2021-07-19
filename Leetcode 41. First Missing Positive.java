class Solution {
    public int firstMissingPositive(int[] nums) {
        int a[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0 && nums[i]<a.length)
            {
                a[nums[i]-1]++;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
                return i+1;
        }
        return 0;
    }
}
