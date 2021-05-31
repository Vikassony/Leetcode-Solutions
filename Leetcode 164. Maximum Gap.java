// O(nlogn) Solution
class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==0 || nums.length==1)
            return 0;
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length-1;i++)
            if(nums[i+1]-nums[i]>res)
                res=nums[i+1]-nums[i];
        return res;
                
    }
}
