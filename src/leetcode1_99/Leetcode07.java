package leetcode1_99;

public class Leetcode07 {
    public int reverse(int x) {
        try {
            if (x >= 0) {
                String str = Integer.toString(x);
                StringBuilder stringBuilder = new StringBuilder(str);
                return Integer.parseInt(stringBuilder.reverse().toString());
            } else {
                String str = Integer.toString(x);
                StringBuilder stringBuilder = new StringBuilder(str.substring(1));
                return -Integer.parseInt(stringBuilder.reverse().toString());
            }
        }catch (Exception e){
            return 0;
        }
    }
}
