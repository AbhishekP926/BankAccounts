/**
 * 
 */
package com.example.mortgage.serviceImpl;

import java.math.BigDecimal;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mortgage.dtos.AccountDetailsDto;
import com.example.mortgage.dtos.Mortgagerequest;
import com.example.mortgage.entities.AccountDetails;
import com.example.mortgage.entities.PaymentDetails;
import com.example.mortgage.entities.ProductDetails;
import com.example.mortgage.repo.MortgageRepo;
import com.example.mortgage.service.MortgageService;

/**
 * @author 34798
 *
 */
@Service
public class MortgageServiceImpl implements MortgageService {

	@Autowired
	MortgageRepo repo;
	@Override
	public AccountDetailsDto createMortgageAccount(Mortgagerequest pMortgagerequest) {
		// TODO Auto-generated method stub
		AccountDetailsDto dto = new AccountDetailsDto();
		AccountDetails dao = new AccountDetails();
		ProductDetails pD= new ProductDetails();
		pD.setProductName(pMortgagerequest.getMortgageProduct());
		
		PaymentDetails pdd = new PaymentDetails();
		dao.setCustomerNumber(pMortgagerequest.getCustomerAccountNumber());
		dao.setMortgagetype(pMortgagerequest.getMortgagetype());
		dao.setProductDeatails(pD);
		dao.setPaymentDetails(pdd);
		
		/*
		 * dao.getProductDeatails().setProductName(pMortgagerequest.getMortgageProduct()
		 * ); dao.getPaymentDetails().setTotalMortgageAmount(pMortgagerequest.
		 * getAmountRequested()); dao.getPaymentDetails().setTotal_tenure(15);
		 * dao.getPaymentDetails().setOutStadningAmount(pMortgagerequest.
		 * getAmountRequested()); dao.getPaymentDetails().setPayed_months(10);
		 * dao.getPaymentDetails().setPayedAmount(new BigDecimal(1000));
		 */
		long timeSeed = System.nanoTime(); // to get the current date time value

        double randSeed = Math.random() * 100000; // random number generation

        
        long midSeed = (long) (timeSeed * randSeed); // mixing up the time and
                                                        // rand number.

                                                        // variable timeSeed
                                                        // will be unique


                                                       // variable rand will 
                                                       // ensure no relation 
                                                      // between the numbers

        String s = midSeed + "";
        String subStr = s.substring(0, 9);

        long finalSeed = Integer.parseInt(subStr);
       dao.setAccountNumer(finalSeed);
       pD.setAccountDetails(dao);
		repo.save(dao);
		BeanUtils.copyProperties(dao, dto);
		return dto;
	}

}
