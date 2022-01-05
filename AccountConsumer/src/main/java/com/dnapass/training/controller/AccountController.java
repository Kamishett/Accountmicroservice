package com.dnapass.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dnapass.training.entity.Account;
import com.dnapass.training.repo.AccountRepository;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@PostMapping("/accounts")
	public Account saveAccount(@RequestBody Account account) {
		return accountRepository.save(account);
	}
	
	@GetMapping("/accounts")
	public List<Account>getAccount(){
		return accountRepository.findAll();
		
	}
	
	@GetMapping("/account/{id}")
	public Account getAccountById(@PathVariable Integer id) {
		Optional<Account> opt =accountRepository.findById(id);
		Account account=opt.get();
		return account;
	}

}
