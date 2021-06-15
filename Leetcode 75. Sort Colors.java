class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(k>=i)
        {
            if(nums[i]==2)
            {
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k--;
            }
            else if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else
                i++;
        }
    }
}
