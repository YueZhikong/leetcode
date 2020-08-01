package leetcode1400_1499;

import java.util.ArrayList;
import java.util.List;

public class leetcode1431 {
    //暴力
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        List<Boolean> list = new ArrayList<>(candies.length);
        for (int candy : candies) {
            list.add(max(candy + extraCandies, max));
        }
        return list;
    }
    private boolean max(int num,int max){
        return num >= max;
    }
}
