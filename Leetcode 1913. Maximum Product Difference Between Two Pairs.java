class Solution {
    public int maxProductDifference(int[] nums) {
       int max=0;
        Arrays.sort(nums);
        int i=0,k=nums.length-1;
        while(i<k)
        {
            if((nums[k-1]*nums[k])-(nums[i]*nums[i+1])>max)
                max=(nums[k-1]*nums[k])-(nums[i]*nums[i+1]);
            i++;
            k--;
        }
        return max;
    }
}
