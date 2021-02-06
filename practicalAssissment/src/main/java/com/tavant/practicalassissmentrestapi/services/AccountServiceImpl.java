package com.tavant.practicalassissmentrestapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tavant.practicalassissmentrestapi.models.Account;
import com.tavant.practicalassissmentrestapi.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;
	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return this.accountRepository.findAll() ;
	}

	@Override
	public Optional<Account> getAccountById(Integer accountId) {
		// TODO Auto-generated method stub
		return this.accountRepository.findById(accountId) ;
	}

}
