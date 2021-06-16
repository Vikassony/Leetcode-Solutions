class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            if(hm.containsKey(i))
            {
                int k=hm.get(i);
                count+=k;
                hm.put(i,k+1);
            }
            else
                hm.put(i,1);
        }
        return count;
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j] && i<j)
        //             count++;
        //     }
        // }
        //return count;
    }
}
