package forOffer;

import java.util.Arrays;
//数组中出现次数超过一半的数字
public class Question41 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr,0,k-1);
    }
}
