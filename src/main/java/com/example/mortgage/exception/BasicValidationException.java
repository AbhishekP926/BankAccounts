/**
 * 
 */
package com.example.mortgage.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.mortgage.enums.ErrorMessageType;

/**
 * @author 34798
 *
 */
public class BasicValidationException extends ValidationException{

	private List<Error> errors;

	/**
	 * @param message
	 * @param messageType
	 */
	public BasicValidationException(String message, List<Error> errors) {
		super(message, ErrorMessageType.BASIC_VALIDATION_ERROR);
		if(errors == null) {
			this.errors = new ArrayList<>();
		}
		else {
			this.errors = Collections.unmodifiableList(errors);
		}
	}

	/**
	 * @return the errors
	 */
	public List<Error> getErrors() {
		return errors;
	}
	
}
