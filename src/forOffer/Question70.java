package forOffer;
//股票的最大利润
public class Question70 {
    //高抛低吸
    public int maxProfit(int[] prices) {
        if (prices.length==0){
            return 0;
        }
        int low=prices[0];//低点
        int high=prices[0];//高点
        int max = high-low;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<low){
                low=prices[i];
                high=prices[i];
            }
            if (prices[i]>high){
                high=prices[i];
            }
            if ((high-low)>max){
                max=high-low;
            }
        }
        return max;
    }
}
