package com.sportan.nicolas.models;

public class Mensaje {
    private String message;

    public Mensaje(){

    }

    public Mensaje(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }

}
