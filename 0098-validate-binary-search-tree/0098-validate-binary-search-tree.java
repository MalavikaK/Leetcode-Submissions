/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   
    public boolean isValidBST(TreeNode root) {
       return isValidBST(root, null, null);
    }
    
     public boolean isValidBST(TreeNode root, Integer min, Integer max){
     /*base conditions */
        if(root == null){
            return true;
        }
        // if(root.val < min  || root.val > max ){
        //     return false;
        // }
          if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
            return false;
        }
         
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
     }
}