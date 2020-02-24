package forOffer;

import java.util.LinkedList;

//二叉树的镜像
public class Question25 {
    //我的思路
    //递归
    public TreeNode mirrorTree(TreeNode root){
        if (root==null){
            return null;
        }
        TreeNode p=root;
        mirror(root);
        return p;
    }
    public void mirror(TreeNode root){
        if (root==null){
            return;
        }
        else {
            TreeNode c = root.left;
            root.left = root.right;
            root.right=c;
            mirror(root.left);
            mirror(root.right);
        }
    }
    //迭代
    public TreeNode mirrorTree2(TreeNode root){
        if (root==null){
            return null;
        }
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp=queue.poll();
            TreeNode left=tmp.left;
            tmp.left=tmp.right;
            tmp.right=left;
            if (tmp.left!=null){
                queue.add(tmp.left);
            }
            if (tmp.right!=null){
                queue.add(tmp.right);
            }
        }
        return root;
    }
}
