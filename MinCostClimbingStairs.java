import java.util.Arrays;

// Dynamic Programming with Recursion
// Time: O(n)
// Space: O(n) due to extra array space and recursion call stack.
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        return Math.min(helper(0, n, arr, cost), helper(1, n, arr, cost));
    }

    public static int helper(int i, int endNdx, int[] arr, int[] cost) {
        if (i >= endNdx) {
            return 0;
        }
        if (arr[i] != -1) {
            return arr[i];
        }

        int jumpOne = helper(i + 1, endNdx, arr, cost);
        int jumpTwo = helper(i + 2, endNdx, arr, cost);
        arr[i] = cost[i] + Math.min(jumpOne, jumpTwo);
        return arr[i];
    }
}