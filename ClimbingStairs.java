import java.util.HashMap;

// Top-Down Implementation using Recursion and Memoization
// Time: O(n), Space: O(n) for hashtable
class Solution {
    public HashMap<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        return helper(n);
    }

    public int helper(int stepsLeft) {
        if (map.containsKey(stepsLeft)) {
            return map.get(stepsLeft);
        }
        if (stepsLeft == 0) {
            return 1;
        }
        if (stepsLeft < 0) {
            return 0;
        }

        int numOfWaysToMakeStepsLeft = helper(stepsLeft - 1) + helper(stepsLeft - 2);
        map.put(stepsLeft, numOfWaysToMakeStepsLeft);
        return numOfWaysToMakeStepsLeft;
    }
}