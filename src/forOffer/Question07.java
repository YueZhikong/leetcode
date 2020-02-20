package forOffer;
//
public class Question07 {
    //递归法超时了
    public int fib(int n) {
        if (n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public int fib2(int n){
        if (n<=1){
            return n;
        }
        else {
            int[] save=new int[n+1];
            save[1]=1;
            for (int i=2;i<=n;i++){
                save[i] = (save[i-1]+save[i-2])%1000000007;
            }
            return save[n]%1000000007;
        }
    }
}
