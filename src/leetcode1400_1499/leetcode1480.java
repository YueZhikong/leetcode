package leetcode1400_1499;
//一维数组的动态和
public class leetcode1480 {
    //遍历，怎么再节省内存？
    //再看
    public int[] runningSum(int[] nums) {
        if (nums.length<=1){
            return nums;
        }
        for (int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
