package forOffer;

import java.util.HashMap;
import java.util.Map;

//重建二叉树
public class Question05focus {
    //我的解法
    //递归或迭代，没看懂
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        if(preorder==null||preorder.length==0){
//            return null;
//        }
//        Map<Integer,Integer> indexMap = new HashMap<>();
//        int length = preorder.length;
//        for (int i=0;i<length;i++){
//            indexMap.put(inorder[i],i);
//        }
//        TreeNode root=buildTree(preorder,0,length-1,inorder,0,length-1,indexMap);
//        return root;
//    }
//
//    public TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd, Map<Integer, Integer> indexMap) {
//        if (preorderStart > preorderEnd) {
//            return null;
//        }
//        int rootVal = preorder[preorderStart];
//        TreeNode root = new TreeNode(rootVal);
//        if (preorderStart == preorderEnd) {
//            return root;
//        } else {
//            int rootIndex = indexMap.get(rootVal);
//            int leftNodes = rootIndex - inorderStart, rightNodes = inorderEnd - rootIndex;
//            TreeNode leftSubtree = buildTree(preorder, preorderStart + 1, preorderStart + leftNodes, inorder, inorderStart, rootIndex - 1, indexMap);
//            TreeNode rightSubtree = buildTree(preorder, preorderEnd - rightNodes + 1, preorderEnd, inorder, rootIndex + 1, inorderEnd, indexMap);
//            root.left = leftSubtree;
//            root.right = rightSubtree;
//            return root;
//        }
//    }
}
