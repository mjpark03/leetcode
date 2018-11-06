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
        if (root == null) return 0;
        
        int left = maxDepth(root.left == null ? null : root.left);
        int right = maxDepth(root.right == null ? null : root.right);
        return Math.max(left, right) + 1;
    }
}
