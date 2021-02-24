package CTCI.Chapter01;
//旋转矩阵
//不想思考了，弃了
public class Question07_no {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        int step=N-1;
        for (int i = 0; i < N/2 + (N%2>0?1:0); i++) {
            for (int j=i;j<step;j++){
                swap(i,j,step,i,j,0,i,N-i,matrix);
            }
            step=step-2;
            if (step<=0){
                return;
            }
        }
    }
    // direction 0 右 1 下 2 左 3 上
    public void swap(int i_abs,int i_ord,int step,int j_abs,int j_ord,int direction,int left,int right,int[][] matrix){
        int step_raw = step;
        while (step>0){
            if (direction%4==0){
                if (j_ord+1<right){
                    j_ord++;
                    step--;
                }
                else {
                    direction = (direction+1)%4;
                }
            }
            if (direction%4==1){
                if (j_abs+1<right){
                    j_abs++;
                    step--;
                }
                else {
                    direction = (direction+1)%4;
                }
            }
            if (direction%4==2){
                if (j_ord-1>=left){
                    j_ord--;
                    step--;
                }
                else {
                    direction = (direction+1)%4;
                }
            }
            if (direction%4==3){
                if (j_abs-1>=left){
                    j_abs--;
                    step--;
                }
                else {
                    direction = (direction+1)%4;
                }
            }
        }
        if (i_abs==j_abs&&i_ord==j_ord){
            return;
        }
        int temp = matrix[j_abs][j_ord];
        matrix[j_abs][j_ord]=matrix[i_abs][i_ord];
        matrix[i_abs][i_ord]=temp;
        swap(i_abs, i_ord, step_raw, j_abs, j_ord, direction, left,right, matrix);
    }

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        new Question07_no().rotate(matrix);
    }
}
