/**
 * 
 */
package com.itcinfotech.bank.online.accounts.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itcinfotech.bank.online.accounts.entity.AccountDao;

/**
 * @author 34798
 *
 */
@Repository
public interface AccountsRepo extends CrudRepository<AccountDao, Long>{

}
