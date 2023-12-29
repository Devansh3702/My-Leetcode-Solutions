// Approach: Iterative Binary Search
// Time: O(log n)
// Space: O(1)
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid;
        while (start != end) {
            mid = start + ((end - start) / 2);
            if (isBadVersion(mid)) {
                if (!isBadVersion(mid - 1)) {
                    return mid;
                }
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}