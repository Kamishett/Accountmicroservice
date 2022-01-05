package com.dnapass.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dnapass.training.entity.Account;
@Repository
public interface AccountRepository  extends JpaRepository  <Account,Integer > {
	
	
		//Iterable <EmployeeEntity2> findByEmpName (String string);

}
	
