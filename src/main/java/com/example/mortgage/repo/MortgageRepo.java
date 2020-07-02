/**
 * 
 */
package com.example.mortgage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mortgage.entities.AccountDetails;


/**
 * @author 34798
 *
 */
@Repository
public interface MortgageRepo extends JpaRepository<AccountDetails, Long>{

}
