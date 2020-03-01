package leetcode1_99;

import forOffer.TreeNode;

public class Leetcode98 {
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        if (root.left!=null&&root.right!=null){
            if (root.left.val>=root.val||root.right.val<=root.val){
                return false;
            }
            else {
                return isValidBST(root.left)&&isValidBST(root.right);
            }
        }
        else if (root.left==null&&root.right!=null){
            if (root.right.val<=root.val){
                return false;
            }
            else {
                return isValidBST(root.right);
            }
        }
        else if (root.left!=null&&root.right==null){
            if (root.left.val>=root.val){
                return false;
            }
            else {
                return isValidBST(root.left);
            }
        }
        else {
            return true;
        }
    }

}
