package forOffer;
//数组中的逆序对
public class Question52 {
    //我的解法
    //暴力遍历
    //超时
    public int reversePairs(int[] nums) {
        int sum=0;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    sum++;
                }
            }
        }
        return sum;
    }
}
