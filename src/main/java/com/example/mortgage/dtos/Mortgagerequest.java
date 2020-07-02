/**
 * 
 */
package com.example.mortgage.dtos;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;

import com.example.mortgage.constants.MortgageType;


/**
 * @author 34798
 *
 */
public class Mortgagerequest {

//	@NotEmpty(message = "customerAccountNumber shouldn't be Empty")
	private Long customerAccountNumber;
	private Long accountNumer;
	private MortgageType mortgagetype;
	private BigDecimal amountRequested;
	private BigDecimal totalpropertyCost;
	private String mortgageProduct;
	/**
	 * @return the customerAccountNumber
	 */
	public Long getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	/**
	 * @param customerAccountNumber the customerAccountNumber to set
	 */
	public void setCustomerAccountNumber(Long customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}
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
	 * @return the amountRequested
	 */
	public BigDecimal getAmountRequested() {
		return amountRequested;
	}
	/**
	 * @param amountRequested the amountRequested to set
	 */
	public void setAmountRequested(BigDecimal amountRequested) {
		this.amountRequested = amountRequested;
	}
	/**
	 * @return the totalpropertyCost
	 */
	public BigDecimal getTotalpropertyCost() {
		return totalpropertyCost;
	}
	/**
	 * @param totalpropertyCost the totalpropertyCost to set
	 */
	public void setTotalpropertyCost(BigDecimal totalpropertyCost) {
		this.totalpropertyCost = totalpropertyCost;
	}
	/**
	 * @return the mortgageProduct
	 */
	public String getMortgageProduct() {
		return mortgageProduct;
	}
	/**
	 * @param mortgageProduct the mortgageProduct to set
	 */
	public void setMortgageProduct(String mortgageProduct) {
		this.mortgageProduct = mortgageProduct;
	}
	
	
}
