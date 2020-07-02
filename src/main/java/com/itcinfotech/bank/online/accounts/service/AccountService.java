/**
 * 
 */
package com.itcinfotech.bank.online.accounts.service;

import org.springframework.stereotype.Service;

import com.itcinfotech.bank.online.accounts.dto.AccountDto;
import com.itcinfotech.bank.online.accounts.dto.AccountRequest;

/**
 * @author 34798
 *
 */
@Service
public interface AccountService {

	
	public AccountDto createBankAccountForCustomer(AccountRequest pAccountRequest);
	
	}
