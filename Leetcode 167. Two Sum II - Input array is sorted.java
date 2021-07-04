class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int res[] = new int[2];
		int s = 0, l = numbers.length - 1;
		while (s < l) {
			int sum = numbers[s] + numbers[l];
			if (target == sum) {
				res[0] = s + 1;
				res[1] = l + 1;
				break;
			} else if (target < sum) {
				l--;
			} else
				s++;
		}
		return res;
	}
}
