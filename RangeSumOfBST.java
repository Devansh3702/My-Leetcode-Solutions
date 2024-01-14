import javax.swing.tree.TreeNode;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int retVal = 0;
        if (root.val >= low && root.val <= high) {
            retVal += root.val;
        }

        int left = rangeSumBST(root.left, low, high);
        int right = rangeSumBST(root.right, low, high);

        return retVal + left + right;
    }
}