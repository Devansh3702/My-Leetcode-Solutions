// Time: O(n) WCRT when degenerate tree, where n = # of nodes. Average RT - O(log n) when balanced tree.
// Space: O(1)

class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int current = 0;
        if (root.val % 2 == 0) {
            if (root.left != null) {
                if (root.left.left != null) {
                    current += root.left.left.val;
                }
                if (root.left.right != null) {
                    current += root.left.right.val;
                }
            }

            if (root.right != null) {
                if (root.right.left != null) {
                    current += root.right.left.val;
                }
                if (root.right.right != null) {
                    current += root.right.right.val;
                }
            }
        }

        int left = sumEvenGrandparent(root.left);
        int right = sumEvenGrandparent(root.right);
        return left + right + current;
    }
}