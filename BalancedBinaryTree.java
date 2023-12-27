// Time: O(n)
// Space: O(n) for recursion call stack

class Solution {
    public boolean isBalanced(TreeNode root) {
        return -1 != dfs(root);
    }

    public static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
