//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// interface GenStackADT
//*************************************************

public interface GenStackADT<E>{ // GenericStackInterface
    void push(E item);
    boolean isEmpty();
    E pop() throws EmptyStackException;
    E peek() throws EmptyStackException;
}
