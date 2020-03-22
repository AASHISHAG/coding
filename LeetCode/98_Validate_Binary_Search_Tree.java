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
    
    public boolean isBST(TreeNode root, long min, long max){
        if(root == null) { return true; }
        else if (min >= root.val || max <= root.val)
        { return false; }
        else { return isBST(root.left, min, root.val) && isBST(root.right, root.val, max); }             
    }
    public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);        
    }
}