package com.tavant.practicalassissmentrestapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tavant.practicalassissmentrestapi.models.Account;

@Service
public interface AccountService {
	public List<Account> getAllAccount();
	public Optional<Account> getAccountById(Integer employeeId);
}
