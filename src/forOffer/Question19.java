package forOffer;
//表示数值的字符串
public class Question19 {
    //我的解法，步步细分，不是很精妙
    public boolean isNumber(String s) {
//        if (s.length()==0||s==null){
//            return false;
//        }
//        else {
//            char first = s.charAt(0);
//            if (first=='+'||first=='-'){
//                if (s.length()==1){
//                    return false;
//                }
//                else {
//                    if (s.charAt(1)>='0'&&s.charAt(1)<='9'){
//
//                    }
//                    else {
//                        return false;
//                    }
//                }
//            }
//            else if (first>='0'&&first<='9'){
//
//            }
//            else {
//                return false;
//            }
//        }
        return false;
    }
    //别人的答案，思路差不多，但是比我的清晰
    int i=0;
    public boolean isNumber02(String s) {
        //input check
        if(s==null || s.length()==0)
            return false;
        //去掉首尾的空字符
        s = s.trim();
        boolean A = scanInteger(s), B=false, C=false;
        //判断是否有B; 使用索引时要确保索引不越界
        if(i<s.length() && s.charAt(i)=='.'){
            i++;
            B = scanUnsignedInteger(s);
        }
        //判断是否有C
        if(i<s.length() && (s.charAt(i)=='e' || s.charAt(i)=='E')){
            i++;
            C = scanInteger(s);
            //如果存在e|E, 但是没有C, 说明不是数字
            if(C==false)
                return false;
        }
        //here, 说明C是合格的, 只需判断A和B的情况
        //i必须扫描完整个字符串 && (A合格则B合不合格都可以, A不合格则B必须合格)
        return i==s.length() && (A || B);

    }
    private boolean scanInteger(String s){
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-'))
            i++;
        return scanUnsignedInteger(s);
    }
    private boolean scanUnsignedInteger(String s){
        //起始索引
        int start = i;
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            i++;
        }
        //i>start说明扫描到了数字;
        //i<=start说明没有扫描到数字, 此种情况说明要么start越界, 要么s.charAt(start)不是数字
        return i > start;
    }


}
