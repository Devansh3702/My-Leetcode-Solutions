import java.util.HashMap;

// Time: O(n)
// Space: O(n)
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] * 2) || (map.containsKey(arr[i] / 2) && arr[i] % 2 == 0)) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}