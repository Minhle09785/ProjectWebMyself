package com.example.ProjectProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProjectProducts.entity.Category;





@Repository
public interface CategoryDao extends JpaRepository<Category, String>{

}
