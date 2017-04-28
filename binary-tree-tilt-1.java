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
    private int tilt = 0;
    
    public int findTilt(TreeNode root) {
        traversal(root);
        return tilt;
    }
    
    private int traversal(TreeNode node) {
        if(node == null) return 0;
        
        int left = traversal(node.left);
        int right = traversal(node.right);
        tilt += Math.abs(left - right);
        return node.val + left + right;
    }
}

