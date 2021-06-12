class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(check(candies,candies[i]+extraCandies))
                al.add(true);
            else
                al.add(false);
        }
        return al;
    }
    public boolean check(int a[], int x)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>x)
                return false;
        }
        return true;
    }
}
