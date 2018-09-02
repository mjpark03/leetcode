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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<TreeNode> currentLevel = new LinkedList<>();
        LinkedList<TreeNode> nextLevel = new LinkedList<>();
        LinkedList<List<Integer>> result = new LinkedList<>();
        
        if (root != null)
            currentLevel.add(root);
        
        while (!currentLevel.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            
            while (!currentLevel.isEmpty()) {
                TreeNode node = currentLevel.poll();
                list.add(node.val);
                
                if (node.left != null)
                    nextLevel.add(node.left);
                if (node.right != null)
                    nextLevel.add(node.right);
            }
            
            result.addFirst(list);
            while (!nextLevel.isEmpty()) {
                currentLevel.add(nextLevel.poll());
            }
        }
        
        return result;
    }
}
