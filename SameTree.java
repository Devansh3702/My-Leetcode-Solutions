// Time: O(n)
// Space: O(1) if ignoring the recursion call stack, otherwise it will be between O(log n) and O(n), depending on the shape of the input trees.
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
