import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.*;

public class Test {
    public static void Quick(int[] array,int left,int right){
        if (left>=right){
            return;
        }
        int key = array[left];
        int i=left;
        int j=right;
        while (i<j){
            while (array[j]>=key&&i<j){
                j--;
            }
            while (array[i]<=key&&i<j){
                i++;
            }
            if (i<j){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        array[left]=array[i];
        array[i]=key;
        Quick(array,left,i-1);
        Quick(array,i+1,right);
    }
    public static void main(String[] args) {
        int[] a= {9,2,3,8,7};
        Quick(a,0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        };
    }


}
