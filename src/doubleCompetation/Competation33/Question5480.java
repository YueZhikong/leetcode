package doubleCompetation.Competation33;

import java.util.List;

public class Question5480 {
    //估计得超时，这破题目
    //要深度搜索，做不出来
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[][] table = new int[n][n];
        for (List<Integer> i:edges){
            table[i.get(0)][i.get(1)]=1;
        }
        return null;
    }

}
