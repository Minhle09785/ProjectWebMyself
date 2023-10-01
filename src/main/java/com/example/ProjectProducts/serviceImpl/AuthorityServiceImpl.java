package com.example.ProjectProducts.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectProducts.dao.AccountDao;
import com.example.ProjectProducts.dao.AuthorityDao;
import com.example.ProjectProducts.entity.Account;
import com.example.ProjectProducts.entity.Authority;
import com.example.ProjectProducts.service.AuthorityService;


@Service
public class AuthorityServiceImpl implements AuthorityService{
@Autowired AuthorityDao dao;
@Autowired AccountDao acdao;

public List<Authority> findAuthoritiesOfAdministrators() {
	List<Account> accounts = acdao.getAdministrators();
	return dao.authoritiesOf(accounts);
}

public List<Authority> findAll() {
	return dao.findAll();
}

public Authority create(Authority auth) {
	return dao.save(auth);
}

public void delete(Integer id) {
	dao.deleteById(id);
}
}
