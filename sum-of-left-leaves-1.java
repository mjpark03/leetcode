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
    int sum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        
        return getLeftSum(root, false);
    }
    
    private int getLeftSum(TreeNode node, boolean isLeft) {
        if (isLeft && node.left == null && node.right == null)
            return node.val;
        
        int left = 0;
        int right = 0;
        
        if (node.left != null)
            left = getLeftSum(node.left, true);
        if (node.right != null)
            right = getLeftSum(node.right, false);
        
        return sum + left + right; 
    }
}
