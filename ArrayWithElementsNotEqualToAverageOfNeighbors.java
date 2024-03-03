// Time: O(n^2) WCRT, O(n) best case.
// Space: O(n) WCRT due to recursion stack (n recursion calls in WCRT)
class Solution {
    public int[] rearrangeArray(int[] nums) {
        return checkCondition(nums);
    }

    private int[] checkCondition(int[] nums) {
        int n = nums.length;
        boolean isValid = true;

        for (int i = 1; i < n - 1; i++) {
            double avg = (nums[i - 1] + nums[i + 1]) / 2;

            if (avg == nums[i]) {
                isValid = false;
                int tmp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = tmp;
                i--;
            }
        }

        if (isValid) {
            return nums;
        }
        return checkCondition(nums);
    }
}