/**
 * 
 */
package com.itcinfotech.bank.online.accounts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itcinfotech.bank.online.accounts.dto.AccountDto;
import com.itcinfotech.bank.online.accounts.dto.AccountRequest;
import com.itcinfotech.bank.online.accounts.service.AccountService;
import com.itcinfotech.bank.online.accounts.serviceImpl.validators.AccountValidator;


/**
 * @author 34798
 *
 */
@RestController
@RequestMapping("/sahabank/v1/accounts")
public class AccountController {

	@Autowired
	AccountService service;
	AccountValidator validator = new AccountValidator();;
	
	@PostMapping(path="/createAccount")
	public ResponseEntity<EntityModel> CreateBankAccount(@Valid @RequestBody AccountRequest pAccountRequest){
		validator.accountCreationValidator(pAccountRequest);
		service.createBankAccountForCustomer(pAccountRequest);
		//Resource has been replaced by EntityModel
        EntityModel<AccountDto> resource = EntityModel.of(service.createBankAccountForCustomer(pAccountRequest));
        //ControllerLinkBuilder has been replace by WebMvcLinkBuilder
//        mortgageProxy.MortgageAccountCreation(mortgageRequest).getBody();
        Link link= WebMvcLinkBuilder.linkTo(AccountController.class).slash("transactionCredentials").withRel("TransactionCredentials");
		resource.add(link);
		return ResponseEntity.status(HttpStatus.OK).body(resource);
	}
	
	@PostMapping()
	public ResponseEntity<EntityModel> updateTransactionCredentials(){
		return null;
	}
	
}
