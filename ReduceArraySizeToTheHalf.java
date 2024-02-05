import java.util.Arrays;
import java.util.HashMap;

// Time: O(n log n) due to Arrays.sort().
// Space: O(n)
class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int mapNdx = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] memo = new int[n];

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], mapNdx);
                mapNdx++;
            }
            memo[map.get(arr[i])]++;
        }

        Arrays.sort(memo);

        int retVal = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (count >= n / 2) {
                return retVal;
            }
            retVal++;
            count += memo[i];
        }
        return retVal;
    }
}