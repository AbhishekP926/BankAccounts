/**
 * 
 */
package com.itcinfotech.bank.online.accounts.serviceImpl;

import java.util.EnumMap;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itcinfotech.bank.online.accounts.dto.AccountDto;
import com.itcinfotech.bank.online.accounts.dto.AccountRequest;
import com.itcinfotech.bank.online.accounts.entity.AccountDao;
import com.itcinfotech.bank.online.accounts.enums.AccountType;
import com.itcinfotech.bank.online.accounts.repo.AccountsRepo;
import com.itcinfotech.bank.online.accounts.service.AccountService;

import lombok.Getter;
import lombok.Setter;



/**
 * @author 34798
 *
 */
@Service
@Setter
@Getter
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountsRepo repo;
	
	
	@Override
	public AccountDto createBankAccountForCustomer(AccountRequest pAccountRequest) {
		// TODO Auto-generated method stub
		AccountDao accountdetails = new AccountDao();;
		AccountDto accountDto = new AccountDto();
		accountdetails.setAccountNumber(getAccountType().get(pAccountRequest.getAccountDto().getAccountType())
				.concat(RandomStringUtils.randomNumeric(11)));
		repo.save(accountdetails);
		BeanUtils.copyProperties(accountdetails, accountDto);
		return accountDto;
	}
	
	public EnumMap<AccountType,String> getAccountType(){
		EnumMap<AccountType, String> map = new EnumMap<AccountType, String>(AccountType.class); 
		map.put(AccountType.SAVINGS_ACCOUNT, "SAVF");
		map.put(AccountType.CURRENT_ACCOUNT,"CURF");
		map.put(AccountType.SAVINGS_AND_ZERO_BALANCE_ACCOUNT, "SAZF");
		map.put(AccountType.SALARY_ACCOUNT,"SALF");
		map.put(AccountType.SAVINGS_JOINT_ACCOUNT,"SAJF");
		return map;
	}

	
}
