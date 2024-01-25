// Time: O(n)
// Space: O(1) if ignoring recursion call stack, else its O(h) [between O(log n) and O(n)]
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        return p.val == q.val && helper(p.left, q.right) && helper(p.right, q.left);
    }
}
