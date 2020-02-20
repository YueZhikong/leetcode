package forOffer;
//旋转数组的最小数字
public class Question09funny {
    //从后往前走
    public int minArray(int[] numbers) {
        int i=numbers.length-1;
        while (i>0){
            if (numbers[i-1]>numbers[i]){
                return numbers[i];
            }
            else {
                i--;
            }
        }
        return numbers[i];
    }
    //二分（减治）
    //分治
}
