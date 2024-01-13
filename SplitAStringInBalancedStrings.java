// Time:O(n)
// Space:O(1)
class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, retVal = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            }
            else {
                count--;
            }
            if (count == 0) {
                retVal++;
            }
        }
        return retVal;
    }
}