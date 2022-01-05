package com.dnapass.training.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.dnapass.training.model.Account;

@Controller
//@RequestMapping("/account")
public class AccountController {
	

	/*
	 * @Autowired RestTemplate restTemplate;
	 */
	
	@Autowired
    AccountClient accountClient;
	
	@GetMapping("/")
	public String home(ModelMap map) {
		Account acc = new Account();
		map.addAttribute("account", acc);
		return "index";
	}

	  /*
	  @GetMapping("/accountList") public String allAccounts(ModelMap map) {
	  Account[] account =
	  restTemplate.getForObject("http://ACCOUNT-CONSUMER/accounts",
	  Account[].class); List<Account> accountList = Arrays.asList(account);
	  map.addAttribute("accList", accountList); return "accountList"; }
	  
	  @PostMapping("/save") public String
	  saveAccount(@Valid @ModelAttribute("account") Account account, BindingResult
	  result) { String responsePage = ""; if (result.hasErrors()) { responsePage =
	  "index"; } else { Random r = new Random(); int id = r.nextInt(99999) + 10000;
	  account.setId(id); Account acc =
	  restTemplate.postForObject("http://ACCOUNT-CONSUMER/accounts", account,
	  Account.class); responsePage = "redirect:/accountList"; } return
	  responsePage; }
	  
	  @GetMapping("/accountDetails/{id}") public String
	  getAccountById(@PathVariable Integer id, ModelMap map) { Account account =
	  restTemplate.getForObject("http://ACCOUNT-CONSUMER/account/{id}",
	  Account.class, id); map.addAttribute("acc", account); return
	  "accountDetails"; }
	  */
	 
	
	
	@GetMapping("/accountList") 
	public String allAccounts(ModelMap map) {
		List<Account>accountList=accountClient.getAllAccounts();
		 
		  map.addAttribute("accList", accountList); 
		  return "accountList";
		  }
	
	@GetMapping("/accountDetails/{id}") 
	public String getAccountById(@PathVariable Integer id, ModelMap map) { 
		Account account = accountClient.findAccountById(id);
		map.addAttribute("acc", account); 
		return"accountDetails"; 
		}
	
	
	@PostMapping("/save") public String saveAccount(@Valid @ModelAttribute("account") Account account, BindingResult
	  result) { 
		String responsePage = ""; 
		if (result.hasErrors()) { 
			responsePage ="index"; 
			} else { 
				Random r = new Random(); 
				int id = r.nextInt(99999) + 10000;
	            account.setId(id);
	            Account acc =accountClient.storeAccount(account);
	            responsePage = "redirect:/accountList"; } 
		        return responsePage; }

}

