// Time: O(n)
// Space: O(1)
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int violation = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                violation++;

                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return violation <= 1;
    }
}
