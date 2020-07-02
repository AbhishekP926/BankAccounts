/**
 * 
 */
package com.itcinfotech.bank.online.accounts.serviceImpl.validators;

import com.itcinfotech.bank.online.accounts.dto.AccountRequest;
import com.itcinfotech.bank.online.accounts.enums.AccountType;
import com.itcinfotech.bank.online.accounts.enums.AccountsConstants;

/**
 * @author 34798
 *
 */
public class AccountValidator {

	public void accountCreationValidator(AccountRequest pAccountRequest) {
		
		if(AccountType.SAVINGS_ACCOUNT.equals(pAccountRequest.getAccountDto().getAccountType()) && pAccountRequest.getAccountDto().getBalance() == AccountsConstants.SAVINGS_ACCOUNT_MIN_BALANCE) {
			throw new RuntimeException("Balance Can't be Zero for Savings Account");
		}
	}
}
