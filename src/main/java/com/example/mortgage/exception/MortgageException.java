/**
 * 
 */
package com.example.mortgage.exception;

import com.example.mortgage.enums.ErrorMessageType;

/**
 * @author 34798
 *
 */
public class MortgageException extends Exception{

	private ErrorMessageType messageType;

	/**
	 * @param messageType
	 */
	public MortgageException(ErrorMessageType messageType) {
		super();
		this.messageType = messageType;
	}



	/**
	 * @param message
	 * @param cause
	 */
	public MortgageException(String message, ErrorMessageType messageType) {
		super(message);
		this.messageType = messageType;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public MortgageException(String message,ErrorMessageType messageType,Exception ex ) {
		super(message,ex);
		this.messageType = messageType;
		// TODO Auto-generated constructor stub
	}

	
	
	
}
