package forOffer;

import java.util.*;

//从上到下打印二叉树
public class Question32 {
    //在上一题的基础上加一个flag
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
            for (int i=1;i<arrayLists.size();i=i+2){
                Collections.reverse(arrayLists.get(i));
            }
            return arrayLists;
        }
    }
}
