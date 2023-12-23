// Time: O(n)
// Space: O(n) - space not optimal O(1)

class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int ndx = (int) Math.ceil(s.length() / 2);
        for (int i = 0; i < ndx; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}