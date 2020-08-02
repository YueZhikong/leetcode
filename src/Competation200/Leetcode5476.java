package Competation200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//找出数组游戏的赢家
public class Leetcode5476 {
    //不移动数组，用指针标记arr[0],arr[1]
    //没写完呜呜呜
    public static int getWinner(int[] arr, int k) {
        int index = 0;
        int win = 0;
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return list.get(index);
    }


}
