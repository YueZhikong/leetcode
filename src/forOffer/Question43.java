package forOffer;
//连续子数组的最大和
public class Question43 {
    //我的解法，超时
    public int maxSubArray(int[] nums) {
        int max =nums[0];
        for (int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;j++){
                int sum=sum(nums,i,j);
                if (sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
    public int sum(int[] nums,int i,int j){
        int sum=0;
        for (int c=i;c<=j;c++){
            sum=sum+nums[c];
        }
        return sum;
    }
}
