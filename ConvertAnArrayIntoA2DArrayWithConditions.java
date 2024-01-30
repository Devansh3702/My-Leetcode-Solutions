import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Time: O(n^2) WCRT when all elements in nums[] are same.
// Space: O(n)
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> retVal = new ArrayList<>();
        int count = 0;

        while (count < nums.length) {
            List<Integer> currList = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0 && !set.contains(nums[i])) {
                    currList.add(nums[i]);
                    set.add(nums[i]);
                    nums[i] = 0;
                    count++;
                }
            }
            retVal.add(currList);
        }

        return retVal;
    }
}