package com.example.ProjectProducts.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectProducts.dao.RoleDao;
import com.example.ProjectProducts.entity.Role;
import com.example.ProjectProducts.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired RoleDao dao;
	
	public List<Role> findAll() {
		return dao.findAll();
	}
}
