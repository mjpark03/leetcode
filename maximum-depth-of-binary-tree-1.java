/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
public class Solution {
    public int maxDepth(TreeNode root) {
        return getDepth(root);
    }
    
    private int getDepth(TreeNode node) {
        if(node == null) return 0;
        
        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);
        
        return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
    }
}