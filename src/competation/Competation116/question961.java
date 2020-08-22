package competation.Competation116;

import java.util.Arrays;

public class question961 {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        for (int i=A.length/2-2;i<=A.length/2;i++){
            if (A[i]==A[i+1]){
                return A[i];
            }
        }
        return 0;
    }
}
