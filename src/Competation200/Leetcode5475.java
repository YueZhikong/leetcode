package Competation200;
//统计好三元组
public class Leetcode5475 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int num = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (Math.abs(arr[i]-arr[j])>a){
                    continue;
                }
                for (int k=j+1;k<arr.length;k++){
                    if (Math.abs(arr[j]-arr[k])>b){
                        continue;
                    }
                    if (Math.abs(arr[i]-arr[k])>c){
                        continue;
                    }
                    num++;
                }
            }
        }
        return num;
    }
}
