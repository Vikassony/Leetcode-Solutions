class Solution {
    public int minPairSum(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j)
        {
            int sum=nums[i++]+nums[j--];
            max=Math.max(sum,max);
            
        }
        return max;
    }
}
