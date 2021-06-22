class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 48 && s.charAt(i) <= 57) && (!al.contains(Character.getNumericValue(s.charAt(i))))) {
				al.add(Character.getNumericValue(s.charAt(i)));
			}
		}
		System.out.println(al);
		int a[] = new int[al.size()];
		for (int i = 0; i < al.size(); i++)
			a[i] = al.get(i);
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			largest = Math.max(largest, a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != largest)
				second = Math.max(second, a[i]);
		}
		if (second == Integer.MIN_VALUE)
			return -1;
		else
			return second;
    }
}
