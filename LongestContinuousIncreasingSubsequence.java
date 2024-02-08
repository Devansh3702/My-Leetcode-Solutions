// Time: O(n)
// Space: O(1)
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int retVal = 0;
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > prev) {
                count++;
            }
            else {
                count = 1;
            }
            retVal = Math.max(retVal, count);
            prev = nums[i];
        }
        return retVal;
    }
}