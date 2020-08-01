package leetcode1500_1599;
//好数对的数目
public class Leetcode1512 {
    //暴力遍历
    public int numIdenticalPairs(int[] nums) {
        int num =0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    num++;
                }
            }
        }
        return num;
    }
    //组合计数
//    public int numIdenticalPairs(int[] nums) {
//        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
//        for (int num : nums) {
//            m.put(num, m.getOrDefault(num, 0) + 1);
//        }
//
//        int ans = 0;
//        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
//            int v = entry.getValue();
//            ans += v * (v - 1) / 2;
//        }
//
//        return ans;
//    }
}
