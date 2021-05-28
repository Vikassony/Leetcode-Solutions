class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=0,j=0,k=0;
        int a[]=new int[n+m];
        while(i<m && j<n)
        {
            if(nums1[i]>nums2[j])
            {
                a[k++]=nums2[j];
                j++;
            }
            else
            {
                a[k++]=nums1[i];
                i++;
            }
        }
        while(i<m)
        {
            a[k++]=nums1[i];
            i++;
        }
        while(j<n)
        {
            a[k++]=nums2[j];
            j++;
        }
        for(i=0;i<n+m;i++)
            nums1[i]=a[i];
    }
}
