//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class Stack
//*************************************************

public class Stack implements StackADT{ // IntArrayStack
    private static final int INITIAL_CAPACITY=10;
    private int[] a;
    private int top;

    public Stack(){
        this(INITIAL_CAPACITY);
    }

    public Stack(int initCapacity){
        if (initCapacity<1)
            throw new IllegalArgumentException("initCapacity must be >= 1");
        a=new int[initCapacity];
        top=-1;
    }

    private void ensureCapacity(){
        if (top==a.length-1)
        {
            int[] b=new int[a.length + INITIAL_CAPACITY];
            for (int i = 0; i < a.length; i++)
                b[i]=a[i];
            a=b;
        }
    }

    public void push(int item){
        ensureCapacity();
        a[++top]=item;
    }

    public boolean isEmpty(){
//        return top==-1;
        if (top==-1)
            return true;
        return false;
    }

    public int pop() throws EmptyStackException{
        if (isEmpty())
            throw new EmptyStackException("stack is empty");
        return a[top--];
    }

    public int peek() throws EmptyStackException{
        if (isEmpty())
            throw new EmptyStackException("stack is empty");
        return a[top];
    }
}
