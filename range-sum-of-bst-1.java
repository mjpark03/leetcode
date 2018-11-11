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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R) + (L <= root.val && root.val <= R ? root.val : 0);
    }
}
