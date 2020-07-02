/**
 * 
 */
package com.example.mortgage.service;

import org.springframework.stereotype.Service;

import com.example.mortgage.dtos.AccountDetailsDto;
import com.example.mortgage.dtos.Mortgagerequest;

/**
 * @author 34798
 *
 */
@Service
public interface MortgageService {

	public AccountDetailsDto createMortgageAccount(Mortgagerequest pMortgagerequest);
}
