package forOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//从上到下打印二叉树2
public class Question31 {
    //我的解法
    //BST
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        else {
            ArrayList<List<Integer>> arrayLists = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()){
                int k = queue.size();
                ArrayList<Integer> arrayList = new ArrayList<>();
                while (k>0){
                    k--;
                    TreeNode c = queue.poll();
                    arrayList.add(c.val);
                    if (c.left!=null){
                        queue.add(c.left);
                    }
                    if (c.right!=null){
                        queue.add(c.right);
                    }
                }
                arrayLists.add(arrayList);
            }
            return arrayLists;
        }
    }
    //递归
    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    public void  helper(TreeNode node,int level){
        if (levels.size()==level){
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(node.val);
        if (node.left!=null){
            helper(node.left,level+1);
        }
        if (node.right!=null){
            helper(node.right,level+1);
        }
    }
    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }

}
