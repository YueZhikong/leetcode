package forOffer;
//1～n整数中1出现的次数
public class Question44 {
    //我的解法
    //超时了
    public int countDigitOne(int n) {
        if (n<1){
            return 0;
        }
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+howManyOne(i);
        }
        return sum;
    }
    public int howManyOne(int n){
        String s = String.valueOf(n);
        int sum=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1'){
                sum++;
            }
        }
        return sum;
    }
}
