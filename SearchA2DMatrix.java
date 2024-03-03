// Time: O(m+n) where m = # of rows and n = # of columns.
// Space: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > target) {
                break;
            }
            row = i;
        }

        if (row == -1) {
            return false;
        }

        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] == target) {
                return true;
            }
        }
        return false;
    }
}