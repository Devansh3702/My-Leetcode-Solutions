// Greedy Algorithm Approach
// Time: O(1)
// Space: O(1)
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int retVal = 0;

        if (numOnes >= k) {
            return k;
        } else {
            retVal = numOnes;
            k -= numOnes;
        }

        if (numZeros >= k) {
            return retVal;
        } else {
            k -= numZeros;
        }

        return retVal - k;
    }
}