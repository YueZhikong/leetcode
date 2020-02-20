package forOffer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//数组中重复的数字
public class Question01 {
    //我的答案
    //先排序，再查重
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
    //其他方案
    //遍历数组
//    方法一：遍历数组
//    由于只需要找出数组中任意一个重复的数字，因此遍历数组，遇到重复的数字即返回。为了判断一个数字是否重复遇到，使用集合存储已经遇到的数字，如果遇到的一个数字已经在集合中，则当前的数字是重复数字。
//
//    初始化集合为空集合，重复的数字 repeat = -1
//    遍历数组中的每个元素：
//    将该元素加入集合中，判断是否添加成功
//    如果添加失败，说明该元素已经在集合中，因此该元素是重复元素，将该元素的值赋给 repeat，并结束遍历
//    返回 repeat

    public int findRepeatNumber02(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
    //方法三：桶的思想 + 抽屉原理
    //由于数组元素的值都在指定的范围内，这个范围恰恰好与数组的下标可以一一对应；
    //因此看到数值，就可以知道它应该放在什么位置，这里 nums[i] 应该放在下标为 i 的位置上，就根据这一点解题，这种思想与桶排序、哈希表的思想是一致的；
    public int findRepeatNumber03(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            // nums[i] 应该放在下标为 i 的位置上
            while (nums[i] != i) {

                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }
        throw new IllegalArgumentException("数组中不存在重复数字！");
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

//    作者：liweiwei1419
//    链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/tong-de-si-xiang-by-liweiwei1419/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
