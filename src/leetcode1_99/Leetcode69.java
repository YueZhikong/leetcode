package leetcode1_99;

public class Leetcode69 {
    public static int mySqrt(int x) {
        double result = 0.0;
        double left = 0.0;
        double right = (double)x;
        double N = 1000;
        while (N>0){
            N--;
            result  = (right+left)/2.0;
            if (result*result>x){
                right = result;
            }
            else if (result*result<x){
                left = result;
            }
            else {
                return (int)result;
            }
        }
        if (((int)result+1)*((int)result+1)==x){
            return (int)result + 1;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(Leetcode69.mySqrt(9));
    }
}
