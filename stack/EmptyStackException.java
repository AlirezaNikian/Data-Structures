//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class EmptyStackException
//*************************************************

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){
        super();
    }

    public EmptyStackException(String message){
        super(message);
    }
}
