package forOffer;
//青蛙跳台阶问题
public class Question08funnny {
    //递归,爆栈了
    public int numWays(int n) {
        if (n==2){
            return 2;
        }
        else if (n==1){
            return 1;
        }
        else {
            return (numWays(n-1)+numWays(n-2))%1000000007;
        }
    }
    //o(n) o(n)不可取
    public int numWays02(int n) {
        if (n==2){
            return 2;
        }
        else if (n==1){
            return 1;
        }
        else if (n==0){
            return 1;
        }
        else {
            int[] stage=new int[n];
            stage[0]=1;
            stage[1]=2;
            for (int i=2;i<n;i++){
                stage[i] = (stage[i-1] + stage[i-2])%1000000007;
            }
            return stage[n-1]%1000000007;
        }
    }
    //o(n) o(1) 最优
    public int numWays03(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
    //记忆化递归
    public int numWays04(int n) {
        // 存放从第0~n阶爬到第n阶的爬法数，例如nemo[0]表示从第0阶爬到第n阶的爬法数
        long memo[] = new long[n + 1];
        // 得到从第0阶爬到第n阶的爬法数
        return (int) climb_Stairs(0, n, memo);
    }
    public long climb_Stairs(int i, int n, long memo[]) {
        if (i > n) { // 基本情况1--超出第n阶的走法不能算一种
            return 0;
        }
        if (i == n) { // 基本情况2--能到达第n阶的走法算一种
            return 1;
        }
        if (memo[i] > 0) { // 基本情况3--利用记忆化的到的昂贵结果直接得到几种走法
            return memo[i];
        }
        // 到达第n阶的前一次状态可能有两种，可能是爬两阶上来的，也可以是爬一阶上来的，要得到的结果是两种爬法数之和
        // 将这次的memo[i]记忆化，memo[i]表示从第i阶爬到第n阶的爬法数
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        // 返回记忆化结果中第i阶爬到第n阶的爬法数
        return memo[i] % 1000000007;
    }

//    作者：mu-yi-wei-lan
//    链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/solution/ji-yi-hua-di-gui-suan-fa-gao-ding-qing-wa-tiao-tai/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
