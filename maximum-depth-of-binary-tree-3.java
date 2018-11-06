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
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.add(root);
        
        int depth = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                TreeNode node = q.poll();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                size--;
            }
            
            depth++;
        }
        
        return depth;
    }
}
