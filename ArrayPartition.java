import java.util.Arrays;

// Time: O(n log n) due to Arrays.sort()
// Space: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int retVal = 0;

        for (int i = 0; i < nums.length; i += 2) {
            retVal += nums[i];
        }
        return retVal;
    }
}