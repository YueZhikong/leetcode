package forOffer;
//顺时针打印矩阵
public class Question27 {
    //我的解法，上下左右都有墙
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0){
            return new int[0];
        }
        else {

            int left=0;
            int right=matrix[0].length-1;
            int up=0;
            int down=matrix.length-1;
            int[] result = new int[(right+1)*(down+1)];
            int i=0;
            while (true){
                //先往右走
                for (int c=left;c<=right;c++){
                    result[i]=matrix[up][c];
                    i++;
                }
                up++;
                if (up>down){
                    break;
                }
                //往下走
                for (int c=up;c<=down;c++){
                    result[i]=matrix[c][right];
                    i++;
                }
                right--;
                if (left>right){
                    break;
                }
                //往左走
                for (int c=right;c>=left;c--){
                    result[i]=matrix[down][c];
                    i++;
                }
                down--;
                if (up>down){
                    break;
                }
                //往上走
                for (int c=down;c>=up;c--){
                    result[i]=matrix[c][left];
                    i++;
                }
                left++;
                if (left>right){
                    break;
                }
            }
            return result;
        }
    }
}
