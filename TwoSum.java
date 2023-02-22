class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] arrayToReturn = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arrayToReturn[0] = i;
					arrayToReturn[1] = j;
					break;
				}
			}
		}
		return arrayToReturn;
	}
}