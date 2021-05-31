class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int a[]= new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
            a[nums[i]]++;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==0)
                al.add(i);
            }
        return al;
    }
}
