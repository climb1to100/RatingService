package com.lcwd.rating.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 292929642821367926L;
	
	public ResourceNotFoundException(){
        super("Ratings not found on the server !!");
    }

    public ResourceNotFoundException(String msg){
        super(msg);
    }

}
