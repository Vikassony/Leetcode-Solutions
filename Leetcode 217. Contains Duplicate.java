class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> al = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            al.add(nums[i]);
        if(nums.length!=al.size())
            return true;
        return false;
    }
}
