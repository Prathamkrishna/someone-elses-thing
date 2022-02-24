package com.hospitalmanagement.controller;

import com.hospitalmanagement.repositories.AdminRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	private final AdminRepo adminRepo;

	public AdminController(AdminRepo adminRepo) {
		this.adminRepo = adminRepo;
	}

	@GetMapping("/")
	public String hi(){
		adminRepo.addUser("Shivam");
		return "helo world";
	}
}

