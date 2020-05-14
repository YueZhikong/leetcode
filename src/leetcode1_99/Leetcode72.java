package leetcode1_99;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class Leetcode72 {
    //DP,超时
//    public int minDistance(String word1, String word2) {
//        return dp(word1.length()-1,word2.length()-1,word1,word2);
//    }
//    public int dp(int i,int j,String s1,String s2){
//        if (i == -1) return j+1;
//        if (j == -1) return i+1;
//        if (s1.charAt(i)==s2.charAt(j)){
//            return dp(i-1,j-1,s1,s2);
//        }
//        else {
//            return Math.min(dp(i,j-1,s1,s2)+1,
//                    Math.min(dp(i-1,j,s1,s2)+1,
//                            dp(i-1,j-1,s1,s2)+1));
//        }
//    }
    //备忘录,同样超时
//    public int minDistance(String word1, String word2) {
//        int[][] dp=new int[word1.length()][word2.length()];
//        Arrays.fill(dp,-1);
//        return dp(word1.length()-1,word2.length()-1,word1,word2,dp);
//    }
//    public int dp(int i,int j,String s1,String s2,int[][] dp){
//        if (i == -1) return j+1;
//        if (j == -1) return i+1;
//        if (dp[i][j]!=-1){
//            return dp[i][j];
//        }
//        if (s1.charAt(i)==s2.charAt(j)){
//            return dp(i-1,j-1,s1,s2,dp);
//        }
//        else {
//            return Math.min(dp(i,j-1,s1,s2,dp)+1,
//                    Math.min(dp(i-1,j,s1,s2,dp)+1,
//                            dp(i-1,j-1,s1,s2,dp)+1));
//        }
//    }
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) dp[i][0] = i;
        for (int j = 1; j <= n; j++) dp[0][j] = j;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];

                } else {
                    dp[i][j] = min(dp[i - 1][j] + 1,
                            dp[i][j - 1] + 1,
                            dp[i - 1][j - 1] + 1);
                }
            }
        }
        return dp[m][n];
    }

    int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"3");
        hashMap.put(2,"4");
        Iterator iterator = hashMap.keySet().iterator();
        while(iterator.hasNext()) {
            System.out.println(hashMap.get(iterator.next()));
        }
    }
}
