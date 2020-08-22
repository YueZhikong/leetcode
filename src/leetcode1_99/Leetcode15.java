package leetcode1_99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class Leetcode15 {
    //优化之后依然超时，大失败
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            if (nums[i]>0){
                break;
            }
            for (int j=i+1;j<nums.length-1;j++){
                if (nums[i]+nums[j]>0){
                    break;
                }
                for (int k= j+1;k<nums.length;k++){
                    if (nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        if (!result.contains(temp)){
                            result.add(temp);

                        }
                    }
                    else if (nums[i]+nums[j]+nums[k]>0){
                        break;
                    }
                }
            }
        }
        return result;
    }
    //双指针，理论时间复杂度o(n^2) 空间复杂度 o(n),没写完，复杂而且时间复杂度和我之前想的不一样
//    public List<List<Integer>> threeSum02(int[] nums) {
//        if (nums.length<3){
//            return new ArrayList<>();
//        }
//        Arrays.sort(nums);
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        for (int i=0;i<nums.length;i++){
//            hashMap.put(nums[i],nums[i]);
//        }
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0;i<nums.length-1;i++){
//            for (int j = i+1;j<nums.length;){
//            }
//        }
//        return result;
//    }
    //真双指针
    public List<List<Integer>> threeSum03(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            int p = i+1;
            int q = nums.length-1;
            if (nums[i]>0){
                break;
            }
            if (i>0&&nums[i-1]==nums[i]){
                continue;
            }
            while (p<q){
                if (nums[i]+nums[p]>0){
                    break;
                }
                int sum = nums[i] + nums[p] + nums[q];
                if (sum==0){
                    if (p>i+1&&q<nums.length-1&&nums[p-1]==nums[p]&&nums[q]==nums[q+1]){
                        p++;
                        q--;
                        continue;
                    }
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[p]);
                    temp.add(nums[q]);
                    result.add(temp);
                    p++;
                    q--;
                }
                else if (sum>0){
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
