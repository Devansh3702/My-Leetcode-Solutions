// Time: O(n)
// Space: O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int ndx = 0;
        int zeros = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
            else {
                nums[ndx] = nums[i];
                ndx++;
            }
        }

        for (int i = nums.length - 1; i > nums.length - 1 - zeros; i--) {
            nums[i] = 0;
        }
    }
}