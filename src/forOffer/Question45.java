package forOffer;

//数字序列中某一位的数字
//没看懂，不会
public class Question45 {
    //我的解法，划分区间，在大数的时候错了
    public int findNthDigit(int n) {
        n++;
        int i = 0;
        int weight = 1;
        int j = 9;
        int left = 0;
        int right = 9;
        while (!(n >= left && n <= right)) {
            weight++;
            i = j + 1;
            j = j * 10 + 9;
            left = right + 1;
            right = (j - (i - 1)) * weight + left - 1;
        }
        int h = n - left;
        int beforeN = h / weight;
        int afterN = h % weight;
        if (afterN == 0) {
            return (i + beforeN - 1)%10;
        }
        else {
            String o=String.valueOf(i + beforeN);
            return Integer.parseInt(String.valueOf(o.charAt(afterN-1)));
        }
    }
    //牛客上思路类似的代码
    public int findNthDigit2(int n) {
        if (n < 10) {
            return n;
        }
        int base = 1;
        long count = 0;  //计算有多少位,测试的时候发现有个1e9的用例，这个用例会导致count越界
        while (true) {
            count = helper(base);
            if (n < count) break;
            n -= count;
            base++;
        }
        //得到新的n和count了，算出第n位对应什么数字
        int num = (int) (n / base + Math.pow(10, base - 1));
        return String.valueOf(num).charAt(n % base) - '0';
    }

    // 计算当前有多少位 1位数10种，10位；2位数 90个数字 180位；3位数 900个 2700位
    private long helper(int base) {
        if (base == 1) {
            return 10;
        }
        return (long) (Math.pow(10, base - 1) * 9 * base);
    }
}
