package forOffer;
//扑克牌中的顺子
public class Question68 {
    //我累了，解法出了一些问题
    public boolean isStraight(int[] nums) {
        if (nums.length!=5){
            return false;
        }
        else {
            for (int i=0;i<nums.length-1;i++){
                if (nums[i]!=nums[i+1]-1){
                    return false;
                }
            }
            return true;
        }
    }
}
