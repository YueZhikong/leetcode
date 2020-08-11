package leetcode1_99;

import java.util.Arrays;

public class Leetcode27 {
    //暴力，不过奇怪的是耗时少，耗内存倒是很多
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;
        while (i<length){
            if (nums[i]==val){
                for (int j=i;j<length-1;j++){
                    swap(nums,j,j+1);
                }
                length--;
            }
            else {
                i++;
            }
        }
        return length;
    }
    private void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{3,2,2,3};
        int[] nums = new int[]{0,1,2,2,3,0,4,2};

        Leetcode27 leetcode27 = new Leetcode27();
        System.out.println(leetcode27.removeElement(nums,2));
    }
}
