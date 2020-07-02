/**
 * 
 */
package com.itcinfotech.bank.online.accounts.dto;

import java.math.BigDecimal;

import com.itcinfotech.bank.online.accounts.enums.AccountType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 34798
 *
 */
@Setter
@Getter
public class AccountDto {

	private String accountNumber;
	private AccountType accountType;
	private BigDecimal balance;
	private BigDecimal transactionLimit;
	private String transactionPassword;
}
