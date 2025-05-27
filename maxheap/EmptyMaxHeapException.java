//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class EmptyMaxHeapException
//*************************************************

public class EmptyMaxHeapException extends RuntimeException{
    public EmptyMaxHeapException(){
        super();
    }

    public EmptyMaxHeapException(String message){
        super(message);
    }
}
