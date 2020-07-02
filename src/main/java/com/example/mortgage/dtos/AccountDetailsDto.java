/**
 * 
 */
package com.example.mortgage.dtos;

import java.math.BigDecimal;


import com.example.mortgage.constants.MortgageType;
import com.example.mortgage.entities.PaymentDetails;

/**
 * @author 34798
 *
 */
public class AccountDetailsDto {

	
	private Long accountNumer;
	private Long customerNumber;
	private MortgageType mortgagetype;
	private PaymentDetailsDto paymentDetails;
	/**
	 * @return the accountNumer
	 */
	public Long getAccountNumer() {
		return accountNumer;
	}
	/**
	 * @param accountNumer the accountNumer to set
	 */
	public void setAccountNumer(Long accountNumer) {
		this.accountNumer = accountNumer;
	}
	/**
	 * @return the customerNumber
	 */
	public Long getCustomerNumber() {
		return customerNumber;
	}
	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	/**
	 * @return the mortgagetype
	 */
	public MortgageType getMortgagetype() {
		return mortgagetype;
	}
	/**
	 * @param mortgagetype the mortgagetype to set
	 */
	public void setMortgagetype(MortgageType mortgagetype) {
		this.mortgagetype = mortgagetype;
	}
	/**
	 * @return the paymentDetails
	 */
	public PaymentDetailsDto getPaymentDetails() {
		return paymentDetails;
	}
	/**
	 * @param paymentDetails the paymentDetails to set
	 */
	public void setPaymentDetails(PaymentDetailsDto paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	
}
