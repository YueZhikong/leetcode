package leetcode800_899;
//给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
public class Leetcode832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int m = 0;
            while (m<A[0].length-1-m){
                int temp = (A[i][m]+1)%2;
                A[i][m] = (A[i][A[0].length-1-m]+1)%2;
                A[i][A[0].length-1-m] = temp;
                m++;
            }
            if (m==A[0].length-1-m){
                A[i][m]=(A[i][m]+1)%2;
            }
        }
        return A;
    }
}
