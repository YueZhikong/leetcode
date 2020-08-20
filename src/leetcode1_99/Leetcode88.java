package leetcode1_99;

public class Leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m;
        int i = 0;
        int j = 0;
        while (i <m+n && j<n){
            if (nums1[i]==0 &&i ==length){
                length++;
                nums1[i]=nums2[j];
                i++;
                j++;
            }
           else if (nums1[i]>nums2[j]){
                for (int k=length;k>i;k--){
                    nums1[k]=nums1[k-1];
                }
                length++;
                nums1[i]=nums2[j];
                j++;
            }else {
                i++;
            }
        }
    }
}
