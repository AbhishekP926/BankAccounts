/**
 * 
 */
package com.example.mortgage.entities;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author 34798
 *
 */
@Entity
public class ProductDetails extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2622744658267463245L;
	private String productName;
	private int tenure;
	private BigDecimal maximumEligibilityAmount;
	private BigDecimal interestrate;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accountNumer", nullable = false)
	private AccountDetails accountDetails;
	
	/**
	 * 
	 */
	public ProductDetails() {
		super();
	}
	/**
	 * @return the accountDetails
	 */
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	/**
	 * @param accountDetails the accountDetails to set
	 */
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
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
	
	
}
