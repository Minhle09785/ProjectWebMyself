package com.example.ProjectProducts.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectProducts.dao.CategoryDao;
import com.example.ProjectProducts.entity.Category;
import com.example.ProjectProducts.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDao cdao;

	/* Lấy tất cả loại sản phẩm hiển thị lên danh sách */ 
	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}
	
	
}
