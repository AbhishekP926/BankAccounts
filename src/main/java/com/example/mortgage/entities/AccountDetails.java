/**
 * 
 */
package com.example.mortgage.entities;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import com.example.mortgage.constants.MortgageType;

/**
 * @author 34798
 *
 */
@Entity
public class AccountDetails extends AbstractEntity{

	
	private static final long serialVersionUID = 3964454221115555461L;
	private Long accountNumer;
	private Long customerNumber;
	private MortgageType mortgagetype;
	@Embedded
	private PaymentDetails paymentDetails;
	
	@OneToOne(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL,
    mappedBy = "accountDetails")
	private ProductDetails productDeatails;
	

	
	
	
	/**
	 * 
	 */
	public AccountDetails() {
		super();
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
	 * @return the amount
	 */
	public PaymentDetails getPaymentDetails() {
		if(this.paymentDetails == null) {
			return new PaymentDetails();
		}
		return paymentDetails;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public Long getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	public MortgageType getMortgagetype() {
		return mortgagetype;
	}
	public void setMortgagetype(MortgageType mortgagetype) {
		this.mortgagetype = mortgagetype;
	}
	/**
	 * @return the productDeatails
	 */
	public ProductDetails getProductDeatails() {
		if(this.productDeatails == null) {
		return new ProductDetails();	
		}
		return productDeatails;
	}
	/**
	 * @param productDeatails the productDeatails to set
	 */
	public void setProductDeatails(ProductDetails productDeatails) {
		this.productDeatails = productDeatails;
	}
	
}
