package com.spring.learn.user;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.learn.DB.UserDB;

@Service
public class CorporateService {
	
	@Autowired
	UserDB db;

	public List<Corporate> findAllUser() {
		return db.corporateList;
	}

	public Corporate findUserById(int id) {
		Predicate<? super Corporate> predicate = Corporate -> Corporate.getCorporateId() == id;
		return db.corporateList.stream().filter(predicate).findFirst().get();
	}

	public Corporate addCorporateInList(Corporate corporate) {
		int id = db.corporateList.size()+1;
		corporate.setCorporateId(id);
		db.corporateList.add(corporate);
		return corporate;
	}

}
