//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class MaxPriorityQueue
//*************************************************

public class MaxPriorityQueue{ // IntMaxPriorityQueue
    public static final int INITIAL_CAPACITY=25;
    private MaxHeap heap;

    public MaxPriorityQueue(){
        this(INITIAL_CAPACITY);
    }

    public MaxPriorityQueue(int initCapacity){
        if (initCapacity<1)
            throw new IllegalArgumentException("initCapacity must be >= 1");
        heap=new MaxHeap(initCapacity);
    }

    public int size(){
        return heap.size();
    }

    public void enqueue(int item){
        heap.add(item);
    }

    public int dequeue() throws EmptyMaxHeapException{
        return heap.removeMax();
    }
}
