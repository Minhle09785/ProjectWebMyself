package com.example.ProjectProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProjectProducts.entity.OrderDetail;



@Repository
public interface OrderDetailDao extends JpaRepository<OrderDetail, Long>{

}
