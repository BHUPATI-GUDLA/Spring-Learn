package com.spring.learn.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring.learn.user.Corporate;
import com.spring.learn.user.CorporateService;

@RestController
public class CorporateController {

	@Autowired
	CorporateService corporateDao;

	// Find all corporate

	@RequestMapping("/corporates")
	public List<Corporate> findAllCorporateUser() {
		return corporateDao.findAllUser();
	}

	@GetMapping("/corporate/{id}")
	public Corporate retriveCorporateById(@PathVariable int id) {
		return corporateDao.findUserById(id);
	}

	@PostMapping("/corporate")
	public ResponseEntity<Corporate> addCorporate(@RequestBody Corporate corporate) {
		Corporate corpo = corporateDao.addCorporateInList(corporate);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(corpo.getCorporateId()).toUri();
		return ResponseEntity.created(location).build();

	}

}
