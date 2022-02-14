package com.project.weblux.service.exception;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 2458282419495361212L;

    public ResourceNotFoundException(String msg){
        super(msg);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFoundException() {
    }
}
