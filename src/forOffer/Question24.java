package forOffer;
//树的子结构
public class Question24 {
    //遍历不会写了
//    public boolean isSubStructure(TreeNode A, TreeNode B) {
//        if (A==null&&B==null){
//            return true;
//        }
//        else if (A==null||B==null){
//            return false;
//        }
//        TreeNode a;
//        if ((a=AhasB(A,B))!=null){
//            if (AEqualsB(a,B)){
//                return true;
//            }
//            else {
//                return false;
//            }
//        }
//    }
//    public TreeNode AhasB(TreeNode A,TreeNode B){
//        if (A==null){
//            return null;
//        }
//        else if (A.val==B.val){
//            return A;
//        }
//        else  {
//            TreeNode(A.left)
//        }
//    }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) return false;
        return searchRoot(A, B);
    }

    // 首先找到尽所有可能开始的根节点,然后从该根节点开始找是不是子树，如果是直接结束，不是就看A的子数其他的节点
    public boolean searchRoot(TreeNode a, TreeNode b){
        if (a != null){
            if (b.val == a.val){
                if (isSub(a, b)){
                    return true;
                }
            }

            return searchRoot(a.left, b) || searchRoot(a.right, b);
        }

        return false;
    }

    // 判断当前根节点开始，左右子树是否相等
    public boolean isSub(TreeNode a, TreeNode b){
        if (a == null){
            if (b == null) return true;
            return false;
        }

        if (b == null) return true;

        return a.val == b.val && (isSub(a.left, b.left) && isSub(a.right, b.right));
    }


}
