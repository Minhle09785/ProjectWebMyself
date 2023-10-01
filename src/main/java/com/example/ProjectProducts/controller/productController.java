package com.example.ProjectProducts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ProjectProducts.entity.Product;
import com.example.ProjectProducts.service.CategoryService;
import com.example.ProjectProducts.service.ProductService;
import com.example.ProjectProducts.serviceImpl.ProductServiceImpl;

@Controller
public class productController {

	@Autowired
	ProductService productService;
	@Autowired
	ProductServiceImpl productServiceImpl;
	@Autowired
	CategoryService categoriService;

	@RequestMapping("/product/list")
	public String productList(Model model, @RequestParam("cid") Optional<String> cid) {
		// ánh xạ dự liệu Products lên trang page "/product/list"

		if (cid.isPresent()) {
			List<Product> list = productService.findByCategoryId(cid.get());
			model.addAttribute("items", list);
		} else {
			List<Product> list = productService.findAll();
			model.addAttribute("items", list);
		}
		return "views/product/product-list";
	}

	@RequestMapping("/product/checkout")
	public String checkOut(Model model) {
		return "views/product/chechout";
	}

	@RequestMapping("/product/list/product-detail/{id}")
	public String productDetail(Model model, @PathVariable("id") Integer id, @RequestParam("cid") Optional<String> cid,
			RedirectAttributes ra) {
		try {
			Product item = productService.findById(id);
			model.addAttribute("item", item);
		} catch (Exception e) {
			ra.addFlashAttribute("alert", e.getMessage());
			return "views/product/product-list";
		}
		return "views/product/product-detail";
	}

	@RequestMapping("/product/list/wish-list")
	public String wishlist(Model model) {
		return "views/product/wishlist";
	}

}
