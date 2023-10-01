package com.example.ProjectProducts.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectProducts.dao.AccountDao;
import com.example.ProjectProducts.entity.Account;
import com.example.ProjectProducts.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired AccountDao dao;

	@Override
	public Account findById(String username) {
		
		return dao.findById(username).get();
	}

	
	public List<Account> getAdministrators() {
		return dao.getAdministrators();
	}

	
	public List<Account> findAll() {
		return dao.findAll();
	}
	
	
	

}
