class Solution {
    // Optimal
    // Time: O(n)
    // Space: O(1)
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int elementsSum = 0;
        int totalSum = (n * (n + 1)) / 2;

        for (int num : nums) {
            elementsSum += num;
        }
        return totalSum - elementsSum;
    }

    // Not Optimal
    // Time: O(n)
    // Space: O(n)
    public int missingNumber2(int[] nums) {
        int[] helper = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            helper[nums[i]] = 1;
        }
        for (int i = 0; i < helper.length; i++) {
            if (helper[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}