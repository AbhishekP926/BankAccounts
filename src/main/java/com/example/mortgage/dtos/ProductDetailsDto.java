/**
 * 
 */
package com.example.mortgage.dtos;

import java.math.BigDecimal;


/**
 * @author 34798
 *
 */
public class ProductDetailsDto {

	private String productName;
	private int tenure;
	private BigDecimal maximumEligibilityAmount;
	private BigDecimal interestrate;
	private AccountDetailsDto accountDetails;
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the tenure
	 */
	public int getTenure() {
		return tenure;
	}
	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	/**
	 * @return the maximumEligibilityAmount
	 */
	public BigDecimal getMaximumEligibilityAmount() {
		return maximumEligibilityAmount;
	}
	/**
	 * @param maximumEligibilityAmount the maximumEligibilityAmount to set
	 */
	public void setMaximumEligibilityAmount(BigDecimal maximumEligibilityAmount) {
		this.maximumEligibilityAmount = maximumEligibilityAmount;
	}
	/**
	 * @return the interestrate
	 */
	public BigDecimal getInterestrate() {
		return interestrate;
	}
	/**
	 * @param interestrate the interestrate to set
	 */
	public void setInterestrate(BigDecimal interestrate) {
		this.interestrate = interestrate;
	}
	/**
	 * @return the accountDetails
	 */
	public AccountDetailsDto getAccountDetails() {
		return accountDetails;
	}
	/**
	 * @param accountDetails the accountDetails to set
	 */
	public void setAccountDetails(AccountDetailsDto accountDetails) {
		this.accountDetails = accountDetails;
	}
	
}
