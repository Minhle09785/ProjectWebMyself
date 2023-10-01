package com.example.ProjectProducts.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ProjectProducts.dao.AccountDao;
import com.example.ProjectProducts.entity.Account;
import com.example.ProjectProducts.service.OrderService;

@Controller
public class secutityController {

	@Autowired
	OrderService orderService;
	@Autowired
	AccountDao accountDao;

	@RequestMapping("/security/login/form")
	public String getLogin(Model model) {
		return "views/security/login";
	}

	@RequestMapping("/security/login/success")
	public String getLoginsuccess(Model model) {
		model.addAttribute("message", "<b style='color: blue;'>Đăng nhập thành công!</b>");
		return "views/security/login";
	}

	@RequestMapping("/security/login/error")
	public String getLoginError(Model model) {
		model.addAttribute("message", "<b style='color: red;'>Địa chỉ đăng nhập không đúng!</b>");
		return "views/security/login";
	}

	@RequestMapping("/security/logoff/success")
	public String getLogoff(Model model) {
		model.addAttribute("message", "<b style='color: red;'>Logoff Thành công!</b>");
		return "views/security/login";
	}

	@RequestMapping("/my/account")
	public String getAccount(Model model, HttpServletRequest request) {
		/* Lấy dữ liệu từ Order Detail */
		String username = request.getRemoteUser();
		model.addAttribute("orderlist", orderService.findByUsername(username));
		return "views/security/account";
	}

	@RequestMapping("/accountDetails")
	public String GetAccountDetails(Model model, @ModelAttribute("item") Account account) {
		return "views/security/accountDetails";
	}

	@PostMapping("/accountDetails")
	public String PostAccountDetail(Model model, @ModelAttribute("item") Account account) {
		model.addAttribute("message", "Update Thành công");
		accountDao.save(account);
		return "views/security/accountDetails";
	}

	@RequestMapping("/changepassword")
	public String getChangepassword(Model model) {
		return "views/security/changepassword";
	}
}
