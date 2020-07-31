package CTCI.Chapter08;
//面试题08.03 魔术索引
public class Question03 {
    //暴力，做了一点优化
    public int findMagicIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==nums[i])
                return i;
            if(nums[i]>i)
                i = nums[i]-1;//抓住序列是有序的这个点
        }
        return -1;
    }
    //分治，以后再看
}
