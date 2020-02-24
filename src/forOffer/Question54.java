package forOffer;
//在排序数组中查找数字
public class Question54 {
    //我的解法
    //暴力
    public int search(int[] nums, int target) {
        int sum=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                sum++;
            }
        }
        return sum;
    }
}
