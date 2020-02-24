package forOffer;
//打印从1到最大的n位数
public class Question16 {
    //循环来写
    //貌似是最快的
    public int[] printNumbers(int n) {
        int start = 1;
        int length = 1;
        for (int i=1;i<=n;i++){
            length = length*10;
        }
        int[] result = new int[length-1];
        int i=0;
        while (i<length-1){
            result[i]=i+1;
            i++;
        }
        return result;
    }
}
