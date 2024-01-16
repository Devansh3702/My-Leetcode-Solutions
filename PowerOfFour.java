// Time: O(log n) because n is divided by 4 everytime.
// Space: O(1) ignoring recursion call stack.
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (!(n % 4 == 0) || n < 1) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }
}