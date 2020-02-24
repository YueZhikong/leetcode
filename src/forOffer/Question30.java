package forOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//从上到下打印二叉树

public class Question30 {
    //双队列
    public int[] levelOrder(TreeNode root) {
        if (root==null){
            return new int[0];
        }
        else {
            LinkedList<TreeNode> queue = new LinkedList<>();
            LinkedList<TreeNode> queue2 = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                TreeNode c = queue.poll();
                queue2.add(c);
                if (c.left!=null){
                    queue.add(c.left);
                }
                if (c.right!=null){
                    queue.add(c.right);
                }
            }
            int[] result = new int[queue2.size()];
            int h=0;
            while (!queue2.isEmpty()){
                TreeNode a =queue2.poll();
                result[h]=a.val;
                h++;
            }
            return result;
        }
    }
}
