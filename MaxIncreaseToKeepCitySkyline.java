// Time: O(n^2)
// Space: O(n)
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        // using memoization to store max values so don't have to calculate repetitively.
        int[] rowMemo = new int[n];
        int[] colMemo = new int[n];

        // fill rows
        for (int i = 0; i < n; i++) {
            // fill rows
            int rowMax = 0;
            for (int j = 0; j < n; j++) {
                rowMax = Math.max(rowMax, grid[i][j]);
            }
            rowMemo[i] = rowMax;

            // fill columns
            int colMax = 0;
            for (int j = 0; j < n; j++) {
                colMax = Math.max(colMax, grid[j][i]);
            }
            colMemo[i] = colMax;
        }

        int retVal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                retVal += (Math.min(rowMemo[i], colMemo[j]) - grid[i][j]);
            }
        }

        return retVal;
    }
}