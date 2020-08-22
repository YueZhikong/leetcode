package leetcode1_99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length-2;i++){
            int p = i+1;
            int q = nums.length-1;
            if (i>0&&nums[i-1]==nums[i]){
                continue;
            }
            while (p<q){
                int sum = nums[i] + nums[p] + nums[q];
                if (sum==target){
                    return target;
                }
                if (Math.abs(result-target)>Math.abs(sum-target)){
                    result = sum;
                }
                if (sum-target>0){
                    q--;
                }
                else {
                    p++;
                }
            }
        }
        return result;
    }
}
