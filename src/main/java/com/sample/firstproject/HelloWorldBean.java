package com.sample.firstproject;

public class HelloWorldBean {

    public String message;

    public HelloWorldBean(String message) {
        this.message= message;
    }

    //generating getters and setters
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    @Override
//generate toString
    public String toString()
    {
        return String.format ("HelloWorldBean [message=%s]", message);
    }
}

