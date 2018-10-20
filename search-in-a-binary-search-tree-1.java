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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = root;
        
        while (node != null) {
            if (val == node.val)
                return node;
            
            if (val < node.val)
                node = node.left;
            else
                node = node.right;
        }
        
        return null;
    }
}
