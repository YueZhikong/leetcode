package leetcode1_99;

public class Leetcode81_No {
    //todo 只找到了暴力方法，非暴力有思路，未能写出
    public boolean search(int[] nums, int target) {
        int p = 0;
        int q = nums.length-1;
        return binarySearch(nums,p,q,target);
    }
    public boolean binarySearch(int[] nums,int p,int q,int target){
        if (p==q){
            if (target == nums[p]){
                return true;
            }
            return false;
        }
        if (target ==nums[(p+q)/2]){
            return true;
        };
        if (nums[(p+q)/2]<=nums[p]){
            if (target>nums[p]||target<nums[(p+q)/2]){
                return binarySearch(nums,p,(p+q)/2,target);
            }else {
                return binarySearch(nums,(p+q)/2,q,target);
            }
        }
        else {
            if (target>nums[p]&&target<nums[(p+q)/2]){
                return binarySearch(nums,p,(p+q)/2,target);
            }else {
                return binarySearch(nums,(p+q)/2,q,target);
            }
        }
    }
}
