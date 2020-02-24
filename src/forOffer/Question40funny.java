package forOffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//数组中出现次数超过一半的数字
public class Question40funny {
    //我的解法，暴力
    public int majorityElement(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        else {
            int half=nums.length/2;
            for (int i=0;i<=half+1;i++){
                int sum = 0;
                for (int j=i;j<nums.length;j++){
                    if (nums[i]==nums[j]){
                        sum++;
                        if (sum>half){
                            return nums[i];
                        }
                    }
                }
            }
            return 0;
        }
    }
    //官方解法
    //暴力
    public int majorityElement2(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;
    }
    private Map<Integer,Integer> countNums(int[] nums){
        Map<Integer,Integer> counts=new HashMap<>();
        for (int num:nums){
            if (!counts.containsKey(num)){
                counts.put(num,1);
            }
            else {
                counts.put(num,counts.get(num)+1);
            }
        }
        return counts;
    }
    //哈希表，重点，我不太熟悉
    public int majorityElement3(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
    //排序
    public int majorityElement4(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    //分治，不熟悉
    //Boyer-Moore 投票算法


}
