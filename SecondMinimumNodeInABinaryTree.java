import java.util.TreeSet;

// Time: O(n log n) because treeset insertion takes O(log n) avg RT and
// in WCRT, we insert n elements in the treeset.
// Space: O(n) where n = # of nodes.
class Solution {
    private TreeSet<Integer> set;

    public int findSecondMinimumValue(TreeNode root) {      // O(1)
        if (root.left == null && root.right == null) {
            return -1;
        }

        set = new TreeSet<>();
        set.add(root.val);
        boolean b = exploreTree(root);
        return findSecondMin();
    }

    private boolean exploreTree(TreeNode root) {        // n * O(log n) WCRT
        if (root == null) {
            return true;
        }

        set.add(root.val);
        boolean left = exploreTree(root.left);
        boolean right = exploreTree(root.right);
        return true;
    }

    private int findSecondMin() {       // O(1)
        if (set.size() == 1) {
            return -1;
        }
        int ndx = 0;
        for (Integer x : set) {
            if (ndx == 1) {
                return x;
            }
            ndx++;
        }
        return -1;
    }
}
