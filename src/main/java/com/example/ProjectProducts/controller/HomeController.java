package com.example.ProjectProducts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ProjectProducts.entity.Category;
import com.example.ProjectProducts.entity.Product;
import com.example.ProjectProducts.service.CategoryService;
import com.example.ProjectProducts.service.ProductService;
import com.example.ProjectProducts.serviceImpl.ProductServiceImpl;

@Controller
public class HomeController {
	@Autowired
	ProductService productService;
	@Autowired
	ProductServiceImpl productServiceImpl;
	@Autowired
	CategoryService categoryService;

	@RequestMapping("/")
	public String getIndex(Model model) {
		return "redirect:/index";
	}

	@RequestMapping("/index")
	public String getAccount(Model model, @RequestParam("cid") Optional<String> cid, RedirectAttributes ra) {
		try {
			if (cid.isPresent()) {
				List<Product> list = productService.findByCategoryId(cid.get());
				model.addAttribute("items", list);
			} else {
				List<Product> list = productService.findAll();
				model.addAttribute("items", list);
			}
		} catch (Exception e) {
			ra.addFlashAttribute("alert", e.getMessage());
			return "views/product/list-index";
		}
		try {
			List<Category> cateList = categoryService.findAll();
			model.addAttribute("cates", cateList);
		} catch (Exception e) {
			ra.addFlashAttribute("alert", e.getMessage());
			return "views/product/list-index";
		}
		return "views/product/list-index";
	}

}
