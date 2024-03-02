// Time: O(n^2)
// Space: O(n) due to recursion stack and creation of n treenodes.
class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int a, int b) {      // n iterations * O(n)

        if (a > b) {
            return null;
        }
        if (a == b) {
            return new TreeNode(nums[a]);
        }

        int max = -1;
        int maxNdx = -1;

        for (int i = a; i <= b; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxNdx = i;
            }
        }

        TreeNode node = new TreeNode(max);
        node.left = constructMaximumBinaryTree(nums, a, maxNdx - 1);
        node.right = constructMaximumBinaryTree(nums, maxNdx + 1, b);

        return node;
    }
}