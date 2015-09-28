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
    private List<List<Integer>> levelOrderList = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        performLevelOrder(root, 0);
        return levelOrderList;
    }
    
    private void performLevelOrder(TreeNode node, int level) {
        
        if(node==null) {
            return;
        }
        
        if(levelOrderList.size()<=level) {
            List<Integer> tmpList = new ArrayList<Integer>();
            tmpList.add(node.val);
            levelOrderList.add(tmpList);
        } else {
            levelOrderList.get(level).add(node.val);
        }
        
        performLevelOrder(node.left, level+1);
        performLevelOrder(node.right, level+1);
        
        return;
    }
}
