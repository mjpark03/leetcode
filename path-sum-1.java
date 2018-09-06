/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return sum(root, 0, sum);
    }
    
    private boolean sum(TreeNode node, int currentSum, int sum) {
        if (node == null)
            return false;
        
        if (node.left == null && node.right == null)
            return (node.val + currentSum) == sum;
        
        return sum(node.left, node.val + currentSum, sum) || sum(node.right, node.val + currentSum, sum);
    }
}
