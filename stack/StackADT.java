//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// interface StackADT
//*************************************************

public interface StackADT{ // StackInterface
    void push(int item);
    boolean isEmpty();
    int pop() throws EmptyStackException;
    int peek() throws EmptyStackException;
}
