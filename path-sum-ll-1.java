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
    private List<List<Integer>> resultList = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return resultList;
        
        pathSum(root, sum, 0, new ArrayList<Integer>());
        return resultList;
    }
    
    private void pathSum(TreeNode node, int sum, int currentSum, ArrayList<Integer> list) {
        currentSum += node.val;
        list.add(node.val);
        
        if (node.left == null && node.right == null) {
            if (sum == currentSum) resultList.add(list);
            return;
        }
        
        if (node.left != null) pathSum(node.left, sum, currentSum, new ArrayList<Integer>(list));
        if (node.right != null) pathSum(node.right, sum, currentSum, new ArrayList<Integer>(list));
    }
}