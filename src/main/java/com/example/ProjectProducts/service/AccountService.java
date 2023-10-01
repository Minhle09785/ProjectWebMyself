package com.example.ProjectProducts.service;

import java.util.List;

import com.example.ProjectProducts.entity.Account;


public interface AccountService {
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();
}
