package com.tavant.practicalassissmentrestapi.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tavant.practicalassissmentrestapi.exceptions.EmptyObjectException;
import com.tavant.practicalassissmentrestapi.models.Account;
import com.tavant.practicalassissmentrestapi.repository.AccountRepository;
import com.tavant.practicalassissmentrestapi.services.AccountService;


@RestController
@RequestMapping("/api/account")
public class AccountControllers {
    @Autowired
    AccountRepository accountRepositorty;
    @Autowired
    AccountService accountService;
    @GetMapping("/")
	public String getAccount() {
		return "Welcome";
	}
    
    
    @GetMapping()
	public List<Account> getEmployees() {
		return this.accountService.getAllAccount();
	}
    
    @GetMapping("/{id}")
   	public ResponseEntity<Account> getAccountById(@PathVariable("id") Integer id) {
    	try {
    	  return ResponseEntity.ok(this.accountService.getAccountById(id).get());
   
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		return null;
   	}
    
    
    @PostMapping
	public Account addAccount(@RequestBody @Valid Account accounts) throws EmptyObjectException {

		if (accounts.getAccountNumber() == null)
			throw new EmptyObjectException("No data in POST");
		return accountRepositorty.save(accounts);

	}
    
    @DeleteMapping
     public void deleteAccount(@RequestBody @Valid Account accounts) throws EmptyObjectException {
    	if (accounts.getAccountNumber() == null)
			throw new EmptyObjectException("No data in POST");
		accountRepositorty.delete(accounts);

    }
    
}

