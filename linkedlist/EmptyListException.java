//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class EmptyListException
//*************************************************

public class EmptyListException extends RuntimeException{
    public EmptyListException(){
        super();
    }

    public EmptyListException(String message){
        super(message);
    }
}
