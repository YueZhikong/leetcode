package QueueAndStack;

class MyCircularQueue {
    private int[] queue;
    private int head;
    private int tail;
    private int length;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue=new int[k];
        head=0;
        tail=0;
        length=0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (length==0){
            head=0;
            tail=0;
            length++;
            queue[head]=value;
            return true;
        }
        else if (length>=queue.length){
            return false;
        }
        else {
            length++;
            tail=(tail+1)%queue.length;
            queue[tail]=value;
            return true;
        }
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (length==0){
            return false;
        }
        else {
            head=(head+1)%queue.length;
            length--;
            return true;
        }
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (length==0){
            return -1;
        }
        return queue[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (length==0){
            return -1;
        }
        return queue[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (length==0){
            return true;
        }
        else {
            return false;
        }
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if (length==queue.length){
            return true;
        }
        else {
            return false;
        }
    }
}
