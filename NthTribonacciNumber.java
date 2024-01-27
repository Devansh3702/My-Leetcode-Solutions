import java.util.Arrays;

// Dynamic Programming - Iterative and Recursive Solution
class Solution {

    // Bottom Up Approach (Iterative)
    // Time: O(n)
    // Space: O(1)
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int first = 0, second = 1, third = 1;
        int tmp = 0;

        while (n - 3 >= 0) {
            tmp = first + second + third;
            first = second;
            second = third;
            third = tmp;
            n--;
        }
        return tmp;
    }

    // Top Down Approach (Recursion)
    // Time: O(n)
    // Space: O(n)
    public int[] arr;

    public int tribonacci2(int n) {
        arr = new int[n + 1];
        Arrays.fill(arr, -1);
        return helper(n);
    }

    public int helper(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (arr[n] != -1) {
            return arr[n];
        }

        arr[n] = helper(n - 1) + helper(n - 2) + helper(n - 3);
        return arr[n];
    }
}