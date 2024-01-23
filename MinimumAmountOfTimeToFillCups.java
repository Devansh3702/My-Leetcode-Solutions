import java.util.Arrays;

// Time: O(M) where M = greatest element in amount[] array. 
// Arrays.sort() takes negligible time because array length = 3 only.
// Space: O(1)
class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int tmp = amount[0];
        amount[0] = amount[2];
        amount[2] = tmp;

        if (amount[0] <= 0) {
            if (amount[1] <= 0) {
                return amount[2];
            } 
            else {
                if (amount[2] <= 0) {
                    return amount[1];
                }
                return 1 + fillCups(new int[]{amount[0], amount[1] - 1, amount[2] - 1});
            }
        } else {
            if (amount[1] > 0) {
                return 1 + fillCups(new int[]{amount[0] - 1, amount[1] - 1, amount[2]});
            } 
            else {
                if (amount[2] <= 0) {
                    return amount[0];
                }
                return 1 + fillCups(new int[]{amount[0] - 1, amount[1], amount[2] - 1});
            }
        }
    }
}
