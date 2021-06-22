class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
            if(arr[i]==0)
                count++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                if(count>=2)
                    return true;
            }
            else if(al.contains(2*arr[i]))
                return true;
        }
        return false;
    }
}
