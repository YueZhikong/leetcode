package forOffer;

//二叉搜索树的最近公共祖先
public class Question75 {
    //利用二叉搜索树的性质递归
    //通过但太慢了
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val==p.val||root.val==q.val){
            return root;
        }
        if (root.val < p.val & root.val > q.val) {
            return root;
        }
        if (root.val > p.val & root.val < q.val) {
            return root;
        }
        if (root.val < p.val & root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root.val > p.val & root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return null;
    }

}
