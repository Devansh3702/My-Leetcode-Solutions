// Optimal Solution
// Time: O(n)
// Space: O(1)
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] array = {0};
        int tmp = getDiameter(root, array, true);
        return array[0];
    }

    public int getDiameter(TreeNode root, int[] array, boolean val) {
        if (root == null) {
            return 0;
        }

        int leftDepth = getDiameter(root.left, array, false);
        int rightDepth = getDiameter(root.right, array, false);
        array[0] = Math.max(array[0], leftDepth + rightDepth);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
