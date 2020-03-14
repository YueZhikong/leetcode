package forOffer;
//二叉树的最近公共祖先
public class Question76 {
    //递归没有用的好
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if (root==p){
            if (hasTreeNode(root,q)){
                return root;
            }
        }
        if (root==q){
            if (hasTreeNode(root,p)){
                return root;
            }
        }
        if (root.left==p&&root.right==q){
            return root;
        }
        if (root.right==p&&root.left==q){
            return root;
        }

        return null;
    }
    public boolean hasTreeNode(TreeNode root,TreeNode node){
        if (root==null){
            return false;
        }
        if (root==node){
            return true;
        }
        return hasTreeNode(root.left,node)||hasTreeNode(root.right,node);
    }
}
