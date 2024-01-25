// Bottom-Up DP - Optimal Solution
// Time: O(n)
// Space: O(n)
class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            }
            else {
                arr[i] = 1 + arr[i / 2];
            }
        }
        return arr;
    }
}