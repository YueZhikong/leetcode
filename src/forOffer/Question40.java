package forOffer;
//数组中出现次数超过一半的数字
public class Question40 {
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

}
