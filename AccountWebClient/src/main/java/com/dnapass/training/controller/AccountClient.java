package com.dnapass.training.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dnapass.training.model.Account;

@FeignClient(value="ACCOUNT-CONSUMER",url="http://localhost:2222/")
public interface AccountClient {
	
	@GetMapping("/accounts")
	public List<Account> getAllAccounts();
	
	@GetMapping("/account/{id}")
	public Account findAccountById(@PathVariable Integer id);
	
	@PostMapping("/accounts")
	public Account storeAccount(@RequestBody Account account);
	
	

}
