/**
 * 
 */
package com.example.mortgage.dtos;

import java.math.BigDecimal;

/**
 * @author 34798
 *
 */
public class PaymentDetailsDto {

	private BigDecimal totalMortgageAmount;
	private BigDecimal payedAmount;
	private BigDecimal outStadningAmount;
	private int total_tenure;
	private int payed_months;
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
	/**
	 * @return the total_tenure
	 */
	public int getTotal_tenure() {
		return total_tenure;
	}
	/**
	 * @param total_tenure the total_tenure to set
	 */
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
