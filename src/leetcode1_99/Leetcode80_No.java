package leetcode1_99;

public class Leetcode80_No {
    public int removeDuplicates(int[] nums) {
        if (nums.length<=2){
            return nums.length;
        }
        int length = nums.length;
        int p = nums[0];
        int num = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==p){
                num++;
            }
            else {
                p = nums[i];
                num=1;
            }
            if (num>2){
                delete(nums,length,i);
                if (i == length-1){
                    length--;
                    break;
                }
                length--;
                i--;
            }
        }
        return length;
    }
    public void delete(int[] nums,int length,int p){
        for (int i = p+1; i < length; i++) {
            swap(nums,i-1,i);
        }
    }
    public void swap(int[] nums, int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        new Leetcode80_No().removeDuplicates(new int[]{1,1,1});
    }
}
