/**
 * 
 */
package com.example.mortgage.exception;

import com.example.mortgage.enums.ErrorMessageType;

/**
 * @author 34798
 *
 */
public class ValidationException extends MortgageException {

	/**
	 * @param message
	 * @param messageType
	 */
	public ValidationException(String message, ErrorMessageType messageType) {
		super(message, messageType);
		// TODO Auto-generated constructor stub
	}

}
