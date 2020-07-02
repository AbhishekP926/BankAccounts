/**
 * 
 */
package com.itcinfotech.bank.online.accounts.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

import com.itcinfotech.bank.online.accounts.enums.AccountType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 34798
 *
 */
@Entity(name = "BANK_ACCOUNT")
@Setter
@Getter
public class AccountDao extends AbstractEntity {

/**
	 * 
	 */
private static final long serialVersionUID = 4613795782973860143L;

private String accountNumber;
private AccountType accountType;
private BigDecimal balance;
private BigDecimal transactionLimit;
private String transactionPassword;
}
