//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class EmptyQueueException
//*************************************************

public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(){
        super();
    }

    public EmptyQueueException(String message){
        super(message);
    }
}
