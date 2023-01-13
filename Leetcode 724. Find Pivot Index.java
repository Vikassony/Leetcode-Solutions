class Solution {
    public int pivotIndex(int[] nums) {
        // int left[] = new int[nums.length];
        // int right[] = new int[nums.length];
        // int sum = 0;
        // sum = nums[0];
        // left[0] = nums[0];
        // for(int i=1;i<nums.length;i++){
        //     left[i] = sum + nums[i];
        //     sum += nums[i];
        // }
        // sum = nums[nums.length - 1];
        // right[right.length - 1] = sum;
        // for(int i=nums.length-2;i>=0;i--){
        //     right[i] = sum + nums[i];
        //     sum += nums[i];
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(left[i] == right[i])
        //     return i;
        // }
        // return -1;
        int rightSum = 0;
        for(int i : nums){
            rightSum += i;
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
                if(i==0){
                    rightSum -= nums[i];
                    if(leftSum == rightSum){
                        return 0;
                    }
                    leftSum += nums[i];
                }else{
                    rightSum -= nums[i];
                    if(leftSum == rightSum){
                        return i;
                    }
                    leftSum += nums[i];
                }
        }
        return -1;
    }
}
