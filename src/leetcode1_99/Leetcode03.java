package leetcode1_99;
//无重复字符的最长子串
public class Leetcode03 {
    public int lengthOfLongestSubstring(String s) {
        char[] a = new char[s.length()];
        s.getChars(0,s.length()-1,a,0);
        int max = 1;
        while (isRepeat(a,max)){
            max++;
        }
        return max-1;
    }
    public boolean isRepeat(char[] s , int length ){
        boolean flag = false;
        outloop:
        for (int i = 0; i <= s.length-1; i++){
            for (int j = i+ length; j <= s.length-1; j = j + length){
                if (s[i]==s[j]){
                    flag = true;
                    break outloop;
                }
            }
        }
        return flag;
    }
}
