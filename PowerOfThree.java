// Time: O(log n) because n is divided by 3 everytime.
// Space: O(1) ignoring recursion call stack.
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (!(n % 3 == 0) || n < 1) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }
}