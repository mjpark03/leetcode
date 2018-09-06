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
        if (root == null) return false;
        
        LinkedList<TreeNode> nodes = new LinkedList<>();
        LinkedList<Integer> values = new LinkedList<>();
        
        nodes.add(root);
        values.add(root.val);
        
        while (!nodes.isEmpty()) {
            int currentSum = values.poll();
            TreeNode node = nodes.poll();
            
            if (node.left == null && node.right == null && sum == currentSum)
                return true;
            
            if (node.left != null) {
                nodes.add(node.left);
                values.add(currentSum + node.left.val);
            }
            
            if (node.right != null) {
                nodes.add(node.right);
                values.add(currentSum + node.right.val);
            }
        }
        
        return false;
    }
}
