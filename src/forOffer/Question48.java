package forOffer;
//礼物的最大价值
public class Question48 {
    //我的解法
    //贪心算法
    //贪心失败
    public int maxValue(int[][] grid) {
        if (grid.length==1){
            if (grid[0].length==1){
                return grid[0][0];
            }
            else {
                return grid[0][0]+grid[0][grid.length-1];
            }
        }
        int i=0;
        int j=0;
        int sum=grid[0][0];
        while (i!=grid.length-1&&j!=grid[0].length-1){
            int right=0;
            int down=0;
            if (i==grid.length-1){
                right=grid[i][j+1];

            }
            else if (j==grid.length-1){
                down=grid[i+1][j];
            }
            else {
                right=grid[i][j+1];
                down=grid[i+1][j];
            }
            if (right>=down){
                sum=right+sum;
                j++;
            }
            else {
                sum=down+sum;
                i++;
            }
        }
        return sum+grid[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
        int[][] test={{1,3,1},{1,5,1},{4,2,1}};
        Question48 question48 = new Question48();
        question48.maxValue(test);
    }
}
