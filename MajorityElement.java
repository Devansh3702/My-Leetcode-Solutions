import java.util.Arrays;

// Approach: Majority element occurs more than n/2 times that's why it is confirmed that it will be on mid in sorted array
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}