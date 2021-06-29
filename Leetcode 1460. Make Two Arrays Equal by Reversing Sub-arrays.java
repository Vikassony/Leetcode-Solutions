class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length)
            return false;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<target.length;i++)
        {
            if(target[i]!=arr[i])
                return false;
        }
        return true;
        
//         HashMap<Integer,Integer> hm= new HashMap<>();
//          HashMap<Integer,Integer> hm1= new HashMap<>();
//         for(int i=0;i<target.length;i++)
//         {
//             if(hm.containsKey(target[i]))
//             hm.put(target[i],hm.get(target[i])+1);
//             else
//                 hm.put(target[i],1);
            
//              if(hm1.containsKey(arr[i]))
//             hm1.put(arr[i],hm1.get(arr[i])+1);
//             else
//                 hm1.put(arr[i],1);
//         }
//         for(Integer i : hm.keySet())
//         {
//             if(hm1.get(i)!=hm.get(i))
//                 return false;
//         }
//         return true;
    }
}
