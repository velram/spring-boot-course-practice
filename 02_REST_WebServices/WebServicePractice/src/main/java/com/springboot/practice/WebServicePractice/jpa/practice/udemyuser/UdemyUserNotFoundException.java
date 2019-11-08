package com.springboot.practice.WebServicePractice.jpa.practice.udemyuser;

public class UdemyUserNotFoundException extends Throwable {

    private String errorMessage;

    public UdemyUserNotFoundException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
