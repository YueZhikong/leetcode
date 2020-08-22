package competation.Competation116;
//最大宽度坡
public class question962 {
    //我的解法--递归超时
    public int maxWidthRamp(int[] A) {
        return max(A,0,A.length-1);
    }
    public int max(int[]A,int start,int end){
        if (start>=end){
            return 0;
        }
        if (A[start]<=A[end]){
            return end-start;
        }
        else {
            int i=max(A,start+1,end);
            int j=max(A,start,end-1);
            return Math.max(i, j);
        }
    }
    //想不到其他方法，告辞
}
