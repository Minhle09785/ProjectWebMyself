package com.example.ProjectProducts.service;


import java.util.List;

import com.example.ProjectProducts.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {

	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);
	
}
