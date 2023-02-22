class Solution {
	public int removeElement(int[] nums, int val) {
		int temp = 0;
		for (int n : nums) {
			if (n != val) {
				nums[temp] = n;
				temp++;
			}

		}
		return temp;
	}
}