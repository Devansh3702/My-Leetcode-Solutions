import java.util.ArrayList;
import java.util.List;

// Time:  O(n^2) WCRT
// Space: O(n^2)
class Solution {
    public List<List<Integer>> generate(int numRows) {

        int n = 0;
        List<List<Integer>> retVal = new ArrayList<>();
        while (n < numRows) {
            List<Integer> list = new ArrayList<>();
            if (n == 0) {
                list.add(1);
            } else {
                List<Integer> prevList = retVal.get(retVal.size() - 1);
                int targetListSize = n + 1;
                list.add(1);
                for (int i = 0; i < targetListSize - 2; i++) {
                    list.add(prevList.get(i) + prevList.get(i + 1));
                }
                list.add(1);
            }
            retVal.add(list);
            n++;
        }

        return retVal;
    }
}