// Time: O(n)
// Space: O(1)
class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int[] array = new int[52];
        int count = 0;
        char curr;
        for (int i = 0; i < s.length(); i++) {
            curr = s.charAt(i);
            if (Character.isLowerCase(curr)) {
                array[curr - 'a']++;
            }
            else {
                array[curr - 'A' + 26]++;
            }
        }

        for (int x : array) {
            if (x % 2 == 0) {
                count += x;
            }
            else {
                count += ((x / 2) * 2);
            }
        }

        if (count % 2 == 0 && count < s.length()) {
            return count + 1;
        }
        return count;
    }
}