package com.example.ProjectProducts.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ProjectProducts.service.OrderService;

@Controller
public class orderController {

	@Autowired
	OrderService orderService;

	@RequestMapping("/product/cart")
	public String getCart(Model model) {
		return "views/cart/cart";
	}

	@RequestMapping("/order/checkout")
	public String getOrderCheckout(Model model) {
		return "views/order/order-checkout";
	}

	@RequestMapping("/order/detail/{id}")
	public String getOrderDetail(@PathVariable("id") Long id, Model model) {
		model.addAttribute("order", orderService.findById(id));
		return "views/order/order-detail";
	}

}
