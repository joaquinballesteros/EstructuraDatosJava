package org.uma.ed.dataestructure.stack;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){
        super();
    }
    public EmptyStackException(String msg){
        super(msg);
    }
}
