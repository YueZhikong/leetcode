package forOffer;

import java.util.LinkedList;
import java.util.Queue;

//对称的二叉树
public class Question26 {
    //我的解法，使用队列
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return isReverseTree(root.left,root.right) ;

    }
    public  boolean isReverseTree(TreeNode tree1,TreeNode tree2){
        if ( tree1 == null && tree2 == null)
            return true ;
        if ( (tree1 == null  && tree2 != null ) ||
                (tree2 == null  && tree1 != null ) ||
                tree1.val != tree2.val ) {
            return false ;
        }

        return isReverseTree(tree1.left,tree2.right) && isReverseTree(tree1.right,tree2.left) ;
    }
    public boolean isSymmetric2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

}
