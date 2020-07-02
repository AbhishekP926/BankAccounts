/**
 * 
 */
package com.itcinfotech.bank.online.accounts.exceptions;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 34798
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class ExceptionResponseStructure {

	private String errorMessage;
	private String description;
	private LocalDateTime timeofException;
}
