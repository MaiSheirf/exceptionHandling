package com.example.rest;

public class studentNotFoundException extends RuntimeException{
    public studentNotFoundException(String message , Throwable cause){
        super(message,cause);
    }
    public studentNotFoundException(String message){
        super(message);
    }
    public studentNotFoundException(Throwable cause){
        super(cause);
    }
}
