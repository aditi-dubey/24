package com.tavant.practicalassissmentrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavant.practicalassissmentrestapi.models.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
