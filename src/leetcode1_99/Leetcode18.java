package leetcode1_99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode18 {
    //想不出优化，呜呜呜
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length<4){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0;i<nums.length-3;i++){
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for (int j= i+1;j<nums.length-2;j++){
                if (j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int p = j+1;
                int q = nums.length-1;
                while (p<q){
                    int sum = nums[i] +nums[j]+ nums[p] + nums[q];
                    if (sum==target){
                        if (p>i+1&&q<nums.length-1&&nums[p-1]==nums[p]&&nums[q]==nums[q+1]){
                            p++;
                            q--;
                            continue;
                        }
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[p]);
                        temp.add(nums[q]);
                        result.add(temp);
                        p++;
                        q--;
                    }
                    else if (sum>target){
                        q--;
                    }
                    else {
                        p++;
                    }
                }
            }
        }
        return result;
    }
}
