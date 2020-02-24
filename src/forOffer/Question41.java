package forOffer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//数组中出现次数超过一半的数字
public class Question41 {
    //本质快排
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr,0,k-1);
    }
    //本质最大堆
    public int[] getLeastNumbers2(int[] arr, int k) {

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2){
                    return 1;
                }
                else if ((o1<o2)){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        for (int i=0;i<arr.length;i++) {
            priorityQueue.add(arr[i]);
        }
        int[] result = new int[k];
        if (k<=arr.length){
            for (int j=0;j<k;j++){
                result[j]=priorityQueue.poll();
            }
        }
        else {
            for (int j=0;j<arr.length;j++){
                result[j]=priorityQueue.poll();
            }
        }
        return result;
    }
}
