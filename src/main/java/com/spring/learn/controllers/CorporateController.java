package com.spring.learn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learn.user.Corporate;
import com.spring.learn.user.CorporateDaoService;

@RestController
public class CorporateController {

	@Autowired
	CorporateDaoService corporateDao;
	
	
	//Find all corporate
	
	@RequestMapping("/corporates")
	public List<Corporate> findAllCorporateUser() {
		return corporateDao.findAllUser();
	}
	
	
	@GetMapping("/corporate/{id}")
	public Corporate retriveCorporateById(@PathVariable int id) {
		return corporateDao.findUserById(id);
	}
	
	
	@PostMapping("/corporate")
	public List<Corporate> addCorporate(@RequestBody Corporate corporate) {
		
		if (corporate.getCorporateType() == null) {
			return null;
		}
		return corporateDao.addCorporateInList(corporate);
		
	}
	
	
	
}
