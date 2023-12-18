class Solution {
	public int findGCD(int[] nums) {
		int low, high;
		low = high = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < low) {
				low = nums[i];
			}
			if (nums[i] > high) {
				high = nums[i];
			}
		}

		int gcd = 0;
		for (int j = 1; j <= low; j++) {
			if (low % j == 0 && high % j == 0) {
				gcd = j;
			}
		}

		return gcd;
	}
}