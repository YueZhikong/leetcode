package forOffer;
//求1+2+…+n
public class Question71 {
    //短路原则，想不到
    public int sumNums(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += sumNums(n - 1)) > 0);
        return sum;
    }
}
