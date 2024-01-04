import java.util.Arrays;

// Approach: Majority element occurs more than n/2 times that's why it is confirmed that it will be on mid in sorted array
// Time: O(n log n) due to Arrays.sort().
// Space: O(n) WCRT, O(log n) ACRT (both due to Arrays.sort() method).
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
