package forOffer;
//0～n-1中缺失的数字
public class Question55 {
    //我的解法
    //暴力
    public int missingNumber(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}
