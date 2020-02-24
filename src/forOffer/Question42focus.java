package forOffer;


import java.util.ArrayList;
import java.util.PriorityQueue;

//数据流中的中位数
public class Question42focus {
    //单优先队列，理论上没错，但是。。。。
    class MedianFinder {
        PriorityQueue<Integer> priorityQueue;
        /** initialize your data structure here. */
        public MedianFinder() {
            priorityQueue=new PriorityQueue<>();
        }

        public void addNum(int num) {
            priorityQueue.add(num);
        }

        public double findMedian() {
            Integer[] result = priorityQueue.toArray(new Integer[priorityQueue.size()]);
            if (result.length%2==0){
                return (double) (result[result.length/2]+result[result.length/2-1])/2;
            }
            else {
                return (double) result[result.length/2];
            }
        }
    }

    public static void main(String[] args) {

    }
}
