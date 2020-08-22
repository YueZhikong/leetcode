package leetcode100_199;

import forOffer.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue_p = new LinkedList<>();
        Queue<TreeNode> queue_q = new LinkedList<>();
        queue_p.add(p);
        queue_q.add(q);
        while (queue_p.size()!=0&&queue_q.size()!=0){
            if (queue_p.size()!=queue_q.size()){
                return false;
            }
            else {
                TreeNode a = queue_p.poll();
                TreeNode b = queue_q.poll();
                if ((a==null&&b!=null)||(a!=null&&b==null)){
                    return false;
                }
                else {
                    if (a==null&&b==null){
                        continue;
                    }
                    else {
                        if (a.val!=b.val){
                            return false;
                        }else {
                            queue_p.add(a.left);
                            queue_p.add(a.right);
                            queue_q.add(b.left);
                            queue_q.add(b.right);
                        }
                    }
                }
            }
        }
        return true;
    }
}
