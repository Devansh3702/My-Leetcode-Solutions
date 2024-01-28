class Solution {

    // Bottom Up DP - Optimal
    // Time: O(n^2) WCRT due to nested loops.
    // Space: O(1)
    public boolean divisorGame(int n) {
        int moves = 0;
        while (n != 1) {
            int x = 1;
            boolean found = false;
            while (x < n && !found) {
                if (n % x == 0) {
                    found = true;
                }
                else {
                    x--;
                }
            }
            n -= x;
            moves++;
        }
        return moves % 2 == 1;
    }

    // Top Down DP
    // Time: O(n^2)
    // Space: O(n)
    public boolean divisorGame2(int n) {
        return helper(n) % 2 == 1;
    }

    public static int helper(int n) {
        if (n <= 1) {
            return 0;
        }
        int x = 1;
        boolean found = false;

        while (x < n && !found) {
            if (n % x == 0) {
                found = true;
            }
            else {
                x--;
            }
        }
        return 1 + helper(n - x);
    }
}