// Not Optimal - very high RT
// Time: O(t(n^2)) where t = length of longest word.
// Space: O(1)

class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int max = 0;

        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                if (checkCondition(words[a], words[b])) {       // O(t) WCRT
                    max = Math.max(max, words[a].length() * words[b].length());
                }
            }
        }
        return max;
    }

    private boolean checkCondition(String i, String j) {
        int[] array = new int[26];
        for (int k = 0; k < i.length(); k++) {
            array[i.charAt(k) - 'a']++;
        }

        for (int l = 0; l < j.length(); l++) {
            if (array[j.charAt(l) - 'a'] != 0) {
                return false;
            }
        }
        return true;
    }
}