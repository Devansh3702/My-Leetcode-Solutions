// Time: O(n) where n = # of nodes.
// Space: O(n) due to recursion stack and using ReturnValue object for each node.
class Solution {

    public int averageOfSubtree(TreeNode root) {
        return helper(root).numOfAverageNodes;
    }

    public ReturnValue helper(TreeNode root) {
        if (root == null) {
            return new ReturnValue(0, 0, 0);
        }

        ReturnValue left = helper(root.left);
        ReturnValue right = helper(root.right);
        int totalNodes = left.numOfNodes + right.numOfNodes + 1;
        int totalSum = left.sum + right.sum + root.val;
        int average = (int) Math.floor(totalSum / totalNodes);
        int numOfAverageNodes = left.numOfAverageNodes + right.numOfAverageNodes;
        if (average == root.val) {
            numOfAverageNodes++;
        }

        return new ReturnValue(totalNodes, totalSum, numOfAverageNodes);
    }
}

class ReturnValue {
    public int numOfNodes;
    public int sum;
    public int numOfAverageNodes;

    public ReturnValue(int numOfNodes, int sum, int numOfAverageNodes) {
        this.numOfNodes = numOfNodes;
        this.sum = sum;
        this.numOfAverageNodes = numOfAverageNodes;
    }
}