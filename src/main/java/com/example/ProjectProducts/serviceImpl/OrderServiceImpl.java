package com.example.ProjectProducts.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectProducts.dao.OrderDao;
import com.example.ProjectProducts.dao.OrderDetailDao;
import com.example.ProjectProducts.entity.Order;
import com.example.ProjectProducts.entity.OrderDetail;
import com.example.ProjectProducts.service.OrderService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderDao odao;
	@Autowired OrderDetailDao ddao;
	
@Override
public Order create(JsonNode orderData) {
	ObjectMapper mapper = new ObjectMapper();
	Order order = mapper.convertValue(orderData, Order.class);
	odao.save(order);
	
	TypeReference<List<OrderDetail>> type = new TypeReference<List<OrderDetail>>() {};
	List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"),type) /* Đọc JSON sang List Order Detail */
			.stream().peek(d -> d.setOrder(order)).collect(Collectors.toList()); /* Lưu nhiều các Order Detail cùng 1 lúc */
	ddao.saveAll(details);
	return order;
}

@Override
public Order findById(Long id) {
	return odao.findById(id).get();
}

@Override
public List<Order> findByUsername(String username) {
	return odao.findByUsername(username);
}



}
