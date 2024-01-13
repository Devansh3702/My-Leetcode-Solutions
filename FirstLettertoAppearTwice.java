// Time:O(n)
// Space:O(1)
class Solution {
    public char repeatedCharacter(String s) {
        int[] array = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (array[x - 'a'] == 1) {
                return x;
            }
            array[x - 'a']++;
        }
        return ' ';
    }
}