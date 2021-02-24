package leetcode700_799;

public class Leetcode766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int j;
        int k;
        //遍历行
        for (int i = 0; i < row; i++) {
            j=i;
            k=0;
            while (j<row&&k<col){
                if (matrix[j][k]==matrix[i][0]){
                    j++;
                    k++;
                }
                else {
                    return false;
                }
            }
        }
        //遍历列
        for (int i = 1; i < col; i++) {
            j=0;
            k=i;
            while (j<row&&k<col){
                if (matrix[j][k]==matrix[0][i]){
                    j++;
                    k++;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = { {11,74,0,93},{40,11,74,7}};
        System.out.println(new Leetcode766().isToeplitzMatrix(matrix));
    }
}
