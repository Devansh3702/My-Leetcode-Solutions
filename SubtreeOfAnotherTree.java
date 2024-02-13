// Time: O(nM) where n = # of nodes in root and M = # of nodes in subRoot.
// Space: O(n) WCRT due to recursion stack.
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {    // n * O(M)
        if (root == null) {
            return false;
        }

        boolean curr = false;
        if (root.val == subRoot.val) {
            curr = determineIfSubroot(root, subRoot);       // O(M)
            if (curr) {
                return true;
            }
        }

        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);
        return left || right;
    }

    private boolean determineIfSubroot(TreeNode root, TreeNode subRoot) {       // O(M)
        if (root == null && subRoot == null) {
            return true;
        }
        if ((root != null && subRoot == null) || (root == null && subRoot != null)) {
            return false;
        }
        if (root.val != subRoot.val) {
            return false;
        }

        boolean left = determineIfSubroot(root.left, subRoot.left);
        boolean right = determineIfSubroot(root.right, subRoot.right);
        return left && right;
    }
}