package leetcode1000_1099;

public class Leetcode1052 {
    //滑动窗口
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int total=0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i]==0){
                total = total+customers[i];
            }
        }
        int max = total;
        for (int i = 0; i < grumpy.length;i++){
            int temp = total;
            for (int j = i; j<i+X && j<grumpy.length;j++){
                if (grumpy[j]==1){
                    temp = temp + customers[j];
                }
            }
            if (temp>max){
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int X = 3;
        System.out.println(new Leetcode1052().maxSatisfied(customers,grumpy,X));
    }
}
