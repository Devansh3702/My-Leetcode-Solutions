// Time: O(log n) because n is divided by 2 everytime.
// Space: O(1) ignoring recursion call stack.
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 == 1 || n < 1) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
}