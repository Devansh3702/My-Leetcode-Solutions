// Top-Down DP using Memoization
// Time: O(n)
// Space: O(1) because n <= 30, so array size <= 30, ignoring recursion call stack.
class Solution {
    public int fib(int n) {
        int[] memo = new int[31];
        memo[0] = 0;
        memo[1] = 1;
        return calculatefib(n, memo);
    }

    public static int calculatefib(int n, int[] memo) {
        if (n == 0) {
            return 0;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = calculatefib(n - 1, memo) + calculatefib(n - 2, memo);
        return memo[n];
    }
}