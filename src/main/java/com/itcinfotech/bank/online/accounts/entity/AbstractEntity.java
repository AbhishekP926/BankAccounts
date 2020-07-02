/**
 * 
 */
package com.itcinfotech.bank.online.accounts.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 34798
 *
 */
@Setter
@Getter
@MappedSuperclass
public class AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7300162967116619077L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long oId;
	
	private Long version;
	
	private LocalDate createdDate;

}
