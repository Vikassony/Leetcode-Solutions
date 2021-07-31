class Solution {
    public int[] replaceElements(int[] arr) {
    //     int res[] = new int[arr.length];
    //     res[res.length-1]=-1;
    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //         res[i]=check(i+1,arr);
    //     }
    //     return res;
    // }
    // public int check(int st, int a[])
    // {
    //     int max=a[st];
    //     for(int i=st+1;i<a.length;i++)
    //     {
    //         if(a[i]>max)
    //             max=a[i];
    //     }
    //     return max;
        int res[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(arr[arr.length - 1]);
		res[res.length - 1] = -1;
		int k = res[res.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			while (st.size() > 0 && arr[i] > st.peek()) {
				if (st.size() == 1)
					k = st.peek();
				st.pop();
			}
			if (st.isEmpty()) {
				res[i] = k;
				st.push(arr[i]);
			} else {
				res[i] = st.peek();
			}
		}
		return res;
    }
}
