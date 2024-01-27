// Bottom Up DP
// Time: O(n)
// Space: O(1)
class Solution {
    public boolean isSubsequence(String s, String t) {

        int charNdx = 0;
        int count = 0;
        for (int i = 0; i < t.length() && count < s.length(); i++) {
            if (s.charAt(charNdx) == t.charAt(i)) {
                charNdx++;
                count++;
            }
        }
        return count == s.length();
    }
}