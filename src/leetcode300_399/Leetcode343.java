package leetcode300_399;

import java.util.Arrays;

public class Leetcode343 {
    //错误解法
    public  int integerBreak(int n) {
        double a = Math.sqrt(n);
        int b = (int) a;
        if (b >= 2) {
            int[] nums = new int[b];
            Arrays.fill(nums, b);
            int c = n - b * b;
            for (int i = 1; i <= c; i++) {
                nums[i % b] = nums[i % b] + 1;
            }
            int sum = 1;
            for (int i = 0; i < nums.length; i++) {
                sum = sum * nums[i];
            }
            return sum;
        } else {
            return (n - b) * b;
        }
    }


}
