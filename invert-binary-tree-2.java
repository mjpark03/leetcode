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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.add(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                TreeNode node = q.poll();
                TreeNode left = null, right = null;
                
                if (node.left != null) {
                    left = node.left;
                    q.add(left);
                }
                
                if (node.right != null) {
                    right = node.right;
                    q.add(right);
                }
                
                node.left = right;
                node.right = left;
                size--;
            }
        }
        
        return root;
    }
}
