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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        TreeNode valNode = new TreeNode(val);
        
        while (node.val != val) {
            if (val < node.val) {
                if (node.left == null)
                    node.left = valNode;
                else 
                    node = node.left;
            } else {
                if (node.right == null)
                    node.right = valNode;
                else
                    node = node.right;
            }
        }
        
        return root;
    }
}
