package leetcode1_99;

public class Leetcode59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0;
        int top = 0;
        int right = n-1;
        int button = n-1;
        int i = 1;
        while ((left<=right)||(top<=button)){
            //左向右
            for (int p = left;p<=right;p++){
                matrix[top][p] = i;
                i++;
            }
            top++;
            if (top>button){
                break;
            }
            //上往下
            for (int q = top;q<=button;q++){
                matrix[q][right]=i;
                i++;
            }
            right--;
            if (left>right){
                break;
            }
            //右往左
            for (int p = right;p>=left;p--){
                matrix[button][p]=i;
                i++;
            }
            button--;
            if (top>button){
                break;
            }
            //下往上
            for (int q = button;q>=top;q--){
                matrix[q][left]=i;
                i++;
            }
            left++;
            if (left>right){
                break;
            }
        }
        return matrix;
    }
}
