package com.example.rest;

public class studentErrorResponse {
    private int status;
    private String message;
    private long timeStamp;

    public studentErrorResponse(){

    }
    public studentErrorResponse(int status , String message , long timeStamp){
        this.status=status;
        this.message=message;
        this.timeStamp=timeStamp;
    }

    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status){
        this.status=status;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp){
        this.timeStamp=timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
