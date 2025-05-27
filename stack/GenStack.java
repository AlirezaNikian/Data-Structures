//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class GenStack
//*************************************************

public class GenStack<E> implements GenStackADT<E>{ // GenericStack
    private static final int INITIAL_CAPACITY=10;
    private E[] a;
    private int top;
    
    public GenStack(){
        this(INITIAL_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public GenStack(int initCapacity){
        if (initCapacity<1)
            throw new IllegalArgumentException("initCapacity must be >= 1");
        a=(E[]) new Object[initCapacity];
        top=-1;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity(){
        if (top==a.length-1)
        {
            E[] b=(E[]) new Object[a.length + INITIAL_CAPACITY];
            for (int i = 0; i < a.length; i++)
                b[i]=a[i];
            a=b;
        }
    }

    public void push(E item){
        ensureCapacity();
        a[++top]=item;
    }

    public boolean isEmpty(){
//        return top==-1;
        if (top==-1)
            return true;
        return false;
    }

    public E pop() throws EmptyStackException{
        if (isEmpty())
            throw new EmptyStackException("stack is empty");
        return a[top--];
    }

    public E peek() throws EmptyStackException{
        if (isEmpty())
            throw new EmptyStackException("stack is empty");
        return a[top];
    }
}
