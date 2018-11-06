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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Queue<TreeNode> pQ = new LinkedList<>();
        Queue<TreeNode> qQ = new LinkedList<>();
        
        if (p != null) pQ.add(p);
        if (q != null) qQ.add(q);
        
        while (!pQ.isEmpty() && !qQ.isEmpty()) {
            TreeNode pNode = pQ.poll();
            TreeNode qNode = qQ.poll();

            if (pNode != null && qNode != null)
                if (pNode.val != qNode.val) return false;


            if (pNode.left != null) pQ.add(pNode.left);
            if (qNode.left != null) qQ.add(qNode.left);
            if (pQ.size() != qQ.size()) return false;
            
            if (pNode.right != null) pQ.add(pNode.right);
            if (qNode.right != null) qQ.add(qNode.right);
            if (pQ.size() != qQ.size()) return false;
        }
        
        return pQ.size() == qQ.size();
    }
}
