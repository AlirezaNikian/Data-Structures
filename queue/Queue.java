//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class Queue
//*************************************************

public class Queue{ // IntArrayQueue or IntArrayCircularQueue
    private static final int INITIAL_CAPACITY=10;
    private int[] a;
    private int front;
    private int rear;
    
    public Queue(){
        this(INITIAL_CAPACITY);
    }

    public Queue(int initCapacity){
        if (initCapacity<1)
            throw new IllegalArgumentException("initCapacity must be >= 1");
        a=new int[initCapacity + 1];
        front=0;
        rear=0;
    }

    private void ensureCapacity(){
        if (front==(rear+1)%a.length)
        {
            int[] b=new int[a.length + INITIAL_CAPACITY];
            for (int i=0; i<a.length; i++)
            {
                b[i]=a[front];
                front=(front+1)%a.length;
            }	
            front=0;
            rear=a.length-1;
            a=b;
        }
    }

    public void enqueue(int item){
        ensureCapacity();
        rear=(rear+1)%a.length;
        a[rear]=item;
    }

    public boolean isEmpty(){
        if (front==rear)
            return true;
        return false;
    }

    public int dequeue() throws EmptyQueueException{
        if (isEmpty())
            throw new EmptyQueueException("queue is empty");
        front=(front+1)%a.length;
        return a[front];
    }
}
