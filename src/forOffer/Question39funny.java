package forOffer;

import java.util.Arrays;
import java.util.LinkedList;

//字符串的排列
public class Question39funny {
    //回溯法
    private LinkedList<String> list=new LinkedList<>();
    private StringBuilder sb;
    private char[] ch_array;
    private boolean[] selected;
    private int len;
    public String[] permutation(String s) {
        ch_array=s.toCharArray();
        Arrays.sort(ch_array);
        len=ch_array.length;
        selected = new boolean[len];
        sb = new StringBuilder(len);
        dfs(0);
        return list.toArray(new String[list.size()]);
    }
    private void dfs(int order) {
        if (order == len) {
            list.addLast(sb.toString());
            return;
        }
        for (int i = 0; i < len; ++i) {
            //若当前字符已选，跳过
            if (selected[i] ||
                    //若上1个字符已选 且 当前字符 与 上1个字符相同，跳过
                    (i > 0 && selected[i - 1] && ch_array[i] == ch_array[i - 1]))
                continue;
            //加入当前字符
            sb.append(ch_array[i]);
            selected[i] = true;

            dfs(order + 1);
            //回溯到 未加入当前字符 的样子
            sb.deleteCharAt(order);
            selected[i] = false;
        }
    }
}
