package Competation118;

import java.util.Arrays;

public class Leetcode5344 {
    //我的解法先排序，返回排序的下标
    //PASS
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] another= Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(another);
        int[] result=new int[nums.length];
        int k=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (nums[i]==another[j]){
                    result[k]=j;
                    k++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Leetcode5344 test=new Leetcode5344();
        int[] a={8,1,2,2,3};
        test.smallerNumbersThanCurrent(a);
    }
}
