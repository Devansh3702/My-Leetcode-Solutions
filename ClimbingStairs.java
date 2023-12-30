import java.util.HashMap;

// Top-Down Implementation using Recursion and Memoization
// Time: O(n), Space: O(n) for hashtable
class Solution {
    public HashMap<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        int numOfWaysToMakeStepsLeft = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, numOfWaysToMakeStepsLeft);
        return numOfWaysToMakeStepsLeft;
    }
}
