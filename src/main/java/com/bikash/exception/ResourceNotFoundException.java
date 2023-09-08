package com.bikash.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceNotFoundException extends Exception{

	   private int statusCode;
	    private String message;

	public ResourceNotFoundException(String string) {
		 
		        super();
		        this.message = message;
		    
	}

}
