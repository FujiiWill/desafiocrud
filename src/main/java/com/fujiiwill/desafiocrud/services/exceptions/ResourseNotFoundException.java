package com.fujiiwill.desafiocrud.services.exceptions;

public class ResourseNotFoundException extends RuntimeException{

    public ResourseNotFoundException(String msg){
        super(msg);
    }
}
