package forOffer;
//丑数
public class Question50 {
    //我的解法
    //我又想暴力了
    public int nthUglyNumber(int n) {
        int i2=0;
        int i3=0;
        int i5=0;
        int[] dp=new int[n];
        for (int i=1;i<n;i++){
            int ugly=Math.min(Math.min(dp[i2],dp[i3]),dp[i5]);
            dp[i]=ugly;
            if (ugly == dp[i2] * 2) ++i2;
            if (ugly == dp[i3] * 3) ++i3;
            if (ugly == dp[i5] * 5) ++i5;
        }
        return dp[n-1];
    }
}
