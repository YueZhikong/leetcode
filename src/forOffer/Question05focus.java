package forOffer;

import java.util.HashMap;
import java.util.Map;

//重建二叉树
public class Question05focus {
    //我的解法
    //递归或迭代，没看懂
    //失败
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0||inorder.length==0||preorder.length!=inorder.length){
            return null;
        }
        TreeNode root=null;
        build(preorder,inorder,0,preorder.length-1,root);
        return root;
    }
    public void build(int[] preorder,int[] inorder,int i,int j,TreeNode root){
        if (i<0||j>preorder.length-1){
            return;
        }

        root=new TreeNode(preorder[i]);
        if (i>=j){
            return;
        }
        for (int c=i;c<=j;c++){
            if (inorder[c]==preorder[i]){
                build(preorder, inorder, i, c-1, root.left);
                build(preorder, inorder, c+1, j, root.right);
            }
        }
    }
}
