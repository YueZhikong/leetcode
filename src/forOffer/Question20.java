package forOffer;
//调整数组顺序使奇数位于偶数前面
public class Question20 {
    //我的解法
    public int[] exchange(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while (i<j){
            //四种情况
            if (nums[i]%2==1){
                if (nums[j]%2==1){
                    i++;
                }
                else {
                    i++;
                    j--;
                }
            }
            else {
                if (nums[j]%2==1){
                    swap(nums,i,j);
                }
                else {
                    j--;
                }
            }
        }
        return nums;
    }
    public void swap(int[]nums,int i,int j){
        int tmp = nums[j];
        nums[j]=nums[i];
        nums[i]=tmp;
    }
    //双指针原地
    //速度差不多，不知道百分之百怎么实现的
    public int[] exchange02(int[] nums) {
        int start = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 1){
                //交换
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                start++;
            }
        }
        return nums;
    }

}
