import java.util.*;

// Time: O(n) where n = length of groupSizes
// Space: O(n)
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> retVal = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            if (!map.containsKey(groupSizes[i])) {
                List<Integer> list = new ArrayList<>();
                map.put(groupSizes[i], list);
            }

            List<Integer> currList = map.get(groupSizes[i]);
            currList.add(i);

            if (currList.size() == groupSizes[i]) {
                retVal.add(currList);
                map.remove(groupSizes[i]);
            }
            else {
                map.replace(groupSizes[i], currList);
            }
        }

        return retVal;
    }
}