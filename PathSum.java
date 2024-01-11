import javax.swing.tree.TreeNode;

// Optimal
// Time: O(n) where n = total # of nodes
// Space: O(1) if we ignore recursion call tree space.
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return helper(root, targetSum);
    }

    public static boolean helper(TreeNode root, int targetSum) {
        boolean left = false, right = false;

        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                return true;
            }
        }
        if (root.left != null) {
            left = helper(root.left, targetSum - root.val);
        }
        if (root.right != null) {
            right = helper(root.right, targetSum - root.val);
        }
        return left || right;
    }
}