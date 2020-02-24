package forOffer;
//第一个只出现一次的字符
public class Question51 {
    //我的解法
    //暴力解法
    public char firstUniqChar(String s) {
        char[] chars=s.toCharArray();
        for (int i=0;i<chars.length;i++){
            int sum=0;
            for (int j=0;j<chars.length;j++){
                if (chars[i]==chars[j]){
                    sum++;

                }
                if (sum==2){
                    break;
                }
            }
            if (sum==1){
                return chars[i];
            }
        }
        return ' ';
    }
}
