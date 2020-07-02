/**
 * 
 */
package com.example.mortgage.entities;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

/**
 * @author 34798
 *
 */
@Embeddable
public class PaymentDetails {

	private BigDecimal totalMortgageAmount;
	private BigDecimal payedAmount;
	private BigDecimal outStadningAmount;
	private int total_tenure;
	private int payed_months;
	
	
	/**
	 * 
	 */
	public PaymentDetails() {
		super();
	}
	
	/**
	 * @param totalMortgageAmount
	 * @param payedAmount
	 * @param outStadningAmount
	 * @param total_tenure
	 * @param payed_months
	 */
	public PaymentDetails(BigDecimal totalMortgageAmount, BigDecimal payedAmount, BigDecimal outStadningAmount,
			int total_tenure, int payed_months) {
		super();
		this.totalMortgageAmount = totalMortgageAmount;
		this.payedAmount = payedAmount;
		this.outStadningAmount = outStadningAmount;
		this.total_tenure = total_tenure;
		this.payed_months = payed_months;
	}

	/**
	 * @return the totalMortgageAmount
	 */
	public BigDecimal getTotalMortgageAmount() {
		return totalMortgageAmount;
	}
	/**
	 * @param totalMortgageAmount the totalMortgageAmount to set
	 */
	public void setTotalMortgageAmount(BigDecimal totalMortgageAmount) {
		this.totalMortgageAmount = totalMortgageAmount;
	}
	/**
	 * @return the payedAmount
	 */
	public BigDecimal getPayedAmount() {
		return payedAmount;
	}
	/**
	 * @param payedAmount the payedAmount to set
	 */
	public void setPayedAmount(BigDecimal payedAmount) {
		this.payedAmount = payedAmount;
	}
	/**
	 * @return the outStadningAmount
	 */
	public BigDecimal getOutStadningAmount() {
		return outStadningAmount;
	}
	/**
	 * @param outStadningAmount the outStadningAmount to set
	 */
	public void setOutStadningAmount(BigDecimal outStadningAmount) {
		this.outStadningAmount = outStadningAmount;
	}
	public int getTotal_tenure() {
		return total_tenure;
	}
	public void setTotal_tenure(int total_tenure) {
		this.total_tenure = total_tenure;
	}
	/**
	 * @return the payed_months
	 */
	public int getPayed_months() {
		return payed_months;
	}
	/**
	 * @param payed_months the payed_months to set
	 */
	public void setPayed_months(int payed_months) {
		this.payed_months = payed_months;
	}
	
	
}
