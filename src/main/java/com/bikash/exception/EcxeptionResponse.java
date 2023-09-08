package com.bikash.exception;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EcxeptionResponse {
 
    private int statusCode;
    private String message;
 
    public EcxeptionResponse(String message)
    {
        super();
        this.message = message;
    }
}