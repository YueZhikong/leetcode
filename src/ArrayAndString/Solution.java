package ArrayAndString;

import java.util.*;

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
    public List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<Integer> linkedList=new LinkedList<>();

        if (matrix.length==0){
            return linkedList;
        }
        int left=0;
        int top=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        while (true){
            //从左向右
            for (int i=left;i<=right;i++){
                linkedList.add(matrix[top][i]);
            }
            top++;
            if (top>bottom){
                break;
            }
            //从上往下
            for (int i=top;i<=bottom;i++){
                linkedList.add(matrix[i][right]);
            }
            right--;
            if (right<left){
                break;
            }
            //从右往左
            for (int i=right;i>=left;i--){
                linkedList.add(matrix[bottom][i]);
            }
            bottom--;
            if (top>bottom){
                break;
            }
            //从下往上
            for (int i=bottom;i>=top;i--){
                linkedList.add(matrix[i][left]);
            }
            left++;
            if (right<left){
                break;
            }
        }
        return linkedList;
    }
    //杨辉三角
    //不知道哪里有问题，日后再说吧
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        int i=1;
        while (i<=numRows){
            ArrayList<Integer> temp=new ArrayList<>(i);
            if (result.size()==0){
                temp.add(1);
                result.add(temp);
            }
            else {
                for (int j=0;j<i;j++){
                    if (j==0){
                        temp.add(1);
                    }
                    else if (j==i-1){
                        temp.add(1);
                    }
                    else {
                        int a=result.get(result.size()-1).get(j-1);
                        int b=result.get(result.size()-1).get(j);
                        temp.add(a+b);
                    }
                }
                result.add(temp);
            }
            i++;
        }
        return result;
    }
    //二进制求和
    //我想到的又是if else 不想写
    public String addBinary(String a, String b) {
        return null;
    }

}
