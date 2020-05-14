package ArrayAndString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    //寻找数组的中心索引
    public  int pivotIndex(int[] nums) {
        if (nums.length<=2){
            return -1;
        }
        int[] array_left=new int[nums.length];
        int[] array_right=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (i==0){
                array_left[0]=nums[0];
                array_right[nums.length-1]=nums[nums.length-1];
            }
            else {
                array_left[i]=array_left[i-1]+nums[i];
                array_right[nums.length-1-i]=array_right[nums.length-i]+nums[nums.length-1-i];
            }
        }
        if (array_right[1]==0){
            return 0;
        }

        for (int j=1;j<nums.length-1;j++){
            if (array_left[j-1]==array_right[j+1]){
                return j;
            }
        }

        if (array_left[nums.length-2]==0){
            return nums.length-1;
        }
        return -1;
    }
    //至少是其他数字两倍的最大数
    public int dominantIndex(int[] nums) {
        //这两个变量用来保存，最大值以及其下标的
        int index=0;
        int value=nums[0];
        for (int i=0;i<nums.length;i++){
            if (value<nums[i]){
                index=i;
                value=nums[i];
            }
        }
        for (int i=0;i<nums.length;i++){
            if (i!=index&&value<2*nums[i]){
                return -1;
            }
        }
        return index;
    }
    //加一
    public  int[] plusOne(int[] digits) {
        int carry=0;//进位
        for (int i= digits.length-1;i>=0;i--){
            int total;
            if (i==digits.length-1){
                total=digits[i]+carry+1;
            }
            else {
                total=digits[i]+carry;
            }
            digits[i]=total%10;
            carry=total/10;
        }
        if (carry==0){
            return digits;
        }
        else {
            int[] array=new int[digits.length+1];
            System.arraycopy(digits,0,array,1,digits.length);
            array[0]=carry;
            return array;
        }
    }
    //对角线遍历
    //想到的方法接近于if else
//    public int[] findDiagonalOrder(int[][] matrix) {
//
//    }

}
