/**
 * 
 */
package com.itcinfotech.bank.online.accounts.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 34798
 *
 */
@Setter
@Getter
public class AccountRequest {

	@NotNull(message = "Customer ID is mandatoy. Please Enter Customer ID")
	private Long customerId;
	private AccountDto accountDto;
}
