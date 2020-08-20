package leetcode1_99;

public class Leetcode70 {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int i = 1;
        int j = 2;
        int temp = 0;
        for (int k = 3; k <= n;k++){
            temp = j;
            j = j + i;
            i = temp;
        }
        return j;
    }
}
