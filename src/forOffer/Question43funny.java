package forOffer;
//连续子数组的最大和
public class Question43funny {
    //我的解法，暴力超时
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

    //分治法
    //贪心,这个贪心对我来说难在currSum和num[i]的比较
    public int maxSubArray2(int[] nums){
        int n=nums.length;
        int currSum=nums[0],maxSum=nums[0];
        for (int i=1;i<n;i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    //动态规划
    public int maxSubArray3(int[] nums) {
        int n = nums.length, maxSum = nums[0];
        for(int i = 1; i < n; ++i) {
            if (nums[i - 1] > 0) nums[i] += nums[i - 1];
            maxSum = Math.max(nums[i], maxSum);
        }
        return maxSum;
    }
}
