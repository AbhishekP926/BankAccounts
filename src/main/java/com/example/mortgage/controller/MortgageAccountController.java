/**
 * 
 */
package com.example.mortgage.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mortgage.dtos.AccountDetailsDto;
import com.example.mortgage.dtos.Mortgagerequest;
import com.example.mortgage.service.MortgageService;

/**
 * @author 34798
 *
 */
@RestController
@RequestMapping("/itcinfotech/online/mortgage")
public class MortgageAccountController {

	@Autowired
	MortgageService service;
	
	@PostMapping(path = "/createMortgage",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountDetailsDto> MortgageAccountCreation(@RequestBody Mortgagerequest pMortgagerequest ){
		AccountDetailsDto response = service.createMortgageAccount(pMortgagerequest);
		return ResponseEntity.status(HttpStatus.OK).body(response);
//		return ResponseEntity.ok(response);
	}
	

	
}
