package forOffer;
//数值的整数次方
public class Question15 {
    //居然超出时长了，我醉了
    public double myPow(double x, int n) {
        if (n==0){
            return 1;
        }
        else if (n<0){
            int a = -n;//取绝对值
            double result=0.0;
            for (int i=1;i<=a;i++){
                result = result * x;
            }
            return result;
        }
        else {
            double result=0.0;
            for (int i=1;i<=n;i++){
                result = result * x;
            }
            return result;
        }
    }
    //快速幂算法（递归），能理解
    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    public double myPow2(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }
    //快速幂算法（循环）
}
