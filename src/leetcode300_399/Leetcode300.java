package leetcode300_399;

import java.util.Arrays;

public class Leetcode300 {
    //暴力,两个for失败
//    public static int lengthOfLIS(int[] nums) {
//        int maxLength=0;
//        for (int i=0;i<nums.length;i++){
//            int temp=nums[i];
//            int length=0;
//            for (int j=i;j<nums.length;j++){
//                if (nums[j]>=temp){
//                    length++;
//                    temp=nums[j];
//                    System.out.print(temp+" ");
//                }
//                maxLength=Math.max(length,maxLength);
//            }
//            System.out.println();
//        }
//        return maxLength;
//    }
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {10, 9, 2, 5, 3, 7, 101, 18};
    }
}
