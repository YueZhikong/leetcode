package competation.Competation118;

import forOffer.ListNode;
import forOffer.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//二叉树中的列表

public class Leetcode5346 {
    //我的解法先bsf再dsf
    //pass
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head==null||root==null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode c = queue.poll();
            if (c.left!=null){
                queue.add(c.left);
            }
            if (c.right!=null){
                queue.add(c.right);
            }
            if (compare(head,c)){
                return true;
            }
        }
        return false;
    }
    public boolean compare(ListNode head,TreeNode root){
        if (head==null){
            return true;
        }
        if (root==null){
            return false;
        }
        if (head.val!=root.val){
            return false;
        }
        return compare(head.next,root.left)||compare(head.next,root.right);
    }
}
