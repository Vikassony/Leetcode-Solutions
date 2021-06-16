class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=0;
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[k++]=nums[i];
        int b[] = new int[n];
        for(int i=0;i<n;i++)
            b[i]=nums[k++];
        int i=0,j=1,l=0;
        k=0;
        while(i<2*n && j<2*n)
        {
            nums[i]=a[k++];
            i+=2;
            nums[j]=b[l++];
                j+=2;
        }
        return nums;
    }
}
