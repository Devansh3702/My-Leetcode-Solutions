class Solution {
	public int removeDuplicates(int[] nums) {
		int cell = 0;
		for (int i = 0; i < nums.length; i++) {
			if (cell == 0 || nums[i] > nums[i - 1]) {
				nums[cell] = nums[i];
				cell++;
			}
		}
		return cell;
	}
}