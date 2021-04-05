package leetcode100_199;

public class Leetcode191 {
    public int hammingWeight(int n) {
        String str =Integer.toBinaryString(n);
        int i = 0;
        for (int j=0;j<str.length();j++){
            if (str.charAt(j)=='1'){
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        new Leetcode191().hammingWeight(-3);
    }
}
