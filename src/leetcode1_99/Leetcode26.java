package leetcode1_99;

public class Leetcode26 {
    //双指针无优化
//    public int removeDuplicates(int[] nums) {
//        int length = nums.length;
//        if (nums.length==0){
//            return 0;
//        }
//        else if (nums.length==1){
//            return 1;
//        }
//        else {
//            int i = 0;
//            int j = 1;
//            while (j<length){
//                if (nums[i]==nums[j]){
//                    int k=j;
//                    while (k<length-1){
//                        swap(nums,k,k+1);
//                        k++;
//                    }
//                    length--;
//                }
//                else {
//                    i++;
//                    j++;
//                }
//            }
//        }
//        return length;
//    }
//    private void swap(int[] nums,int left, int right){
//        int temp = nums[left];
//        nums[left]=nums[right];
//        nums[right]=temp;
//    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    public static void main(String[] args) {
        Leetcode26 leetcode = new Leetcode26();
        int[] nums = new int[]{1,1,2};
        System.out.println(leetcode.removeDuplicates(nums));
    }
}
