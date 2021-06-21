class Solution {
    public int[] singleNumber(int[] nums) {
        int res[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int k=0;
        for(Integer i: hm.keySet())
        {
            if(hm.get(i)==1)
                res[k++]=i;
        }
        return res;
    }
}
