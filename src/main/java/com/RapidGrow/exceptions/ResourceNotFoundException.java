package com.RapidGrow.exceptions;

import jakarta.annotation.Priority;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Priority(1242)
public class ResourceNotFoundException extends RuntimeException{
    String resourceName;
    String fieldName;
    long fieldvalue;
    public ResourceNotFoundException(String resourceName, String fieldName, long fieldvalue) {
        super(String.format("%s not found with %s : %s", resourceName,fieldName,fieldvalue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldvalue = fieldvalue;
    }


}
