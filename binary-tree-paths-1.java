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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null)
            checkPaths(result, "", root);
        
        return result;
    }
    
    private void checkPaths(List<String> result, String path, TreeNode node) {
        path = path + "->" + node.val;
        
        if (node.left == null && node.right == null) {
            result.add(path.substring(2));
            return;
        }
        
        if (node.left != null)
            checkPaths(result, path, node.left);
        if (node.right != null)
            checkPaths(result, path, node.right);
    }
}
