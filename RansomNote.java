// Optimal
// Time: O(n)
// Space: O(1)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] array = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char x = magazine.charAt(i);
            array[x - 'a']++;
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            char y = ransomNote.charAt(j);
            if (array[y - 'a'] == 0) {
                return false;
            }
            array[y - 'a']--;
        }
        return true;
    }
}