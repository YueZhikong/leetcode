package forOffer;
//二进制中1的个数
public class Question14 {
    //我的解法，使用Integer的自带方法，返回二进制的String
    //这种解法速度太慢了
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int sum=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1'){
                sum++;
            }
        }
        return sum;
    }
    //循环和位移动
    public int hammingWeight2(int n) {
        int bits =0;
        int mask =1;
        for (int i=0;i<32;i++){
            if ((n&mask)!=0){
                bits++;
            }
            mask<<=1;
        }
        return bits;
    }
    //用的某个小技巧
    public int hammingWeight3(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }

}
