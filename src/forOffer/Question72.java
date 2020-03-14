package forOffer;
//不用加减乘除做加法
public class Question72 {
    //加法器原理，我忘了
    public int add(int a, int b) {
        while (a != 0) {
            int temp = a ^ b;
            a = (a & b) << 1;
            b = temp;
        }
        return b;
    }
}
