import java.util.HashSet;

// Time: O(n) - have to iterate all characters.
// Space: O(n) or O(26) where n = # of unique characters.
class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet<>();
        int retVal = s.length();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (set.contains(x)) {
                retVal--;
            }
            else {
                set.add(x);
            }
        }
        return retVal;
    }
}