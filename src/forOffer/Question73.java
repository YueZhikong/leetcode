package forOffer;

public class Question73 {
    //拆成两部分
    public int[] constructArr(int[] a) {
        if (a.length<=1){
            return new int[0];
        }
        int[] b=new int[a.length];
        if (a.length==2){
            b[0]=a[1];
            b[1]=a[0];
            return b;
        }
        int[] front=new int[a.length];
        front[1]=a[0];
        int[] next=new int[a.length];
        next[a.length-2]=a[a.length-1];
        //前部分
        for (int i=2;i<a.length;i++){
            front[i]=front[i-1]*a[i-1];
        }
        //后部分
        for (int i=a.length-3;i>=0;i--){
            next[i]=next[i+1]*a[i+1];
        }
        for (int i=0;i<a.length;i++){
            if (i==0){
                b[i]=next[i];
            }
            else if (i==a.length-1){
                b[i]=front[i];
            }
            else {
                b[i]=front[i]*next[i];
            }
        }
        return b;
    }
}
