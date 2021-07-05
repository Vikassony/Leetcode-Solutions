class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE,sum=0;
		for (int i = 0; i < salary.length; i++) {
            sum+=salary[i];
			if (salary[i] > max)
				max = salary[i];
			if (salary[i] < min)
				min = salary[i];
		}
		return (double)(sum-max-min)/(salary.length-2);
    }
}
