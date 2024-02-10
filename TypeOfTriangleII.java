// Time: O(1)
// Space: O(1)
class Solution {
    public String triangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }

        boolean isValidTriangle = nums[0] + nums[1] > nums[2] && nums[1] + nums[2] > nums[0] && nums[2] + nums[0] > nums[1];

        if (isValidTriangle) {
            if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                return "isosceles";
            }
            return "scalene";
        }
        return "none";
    }
}
