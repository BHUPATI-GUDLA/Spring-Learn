package com.spring.learn.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;


@Component
public class CorporateDaoService {

	private static List<Corporate> corporateList = new ArrayList<Corporate>();

	static {
		corporateList.add(new Corporate(1, "Airtel", 123,null,null,null,null));
		corporateList.add(new Corporate(2, "Bajaj Finance", 456,null,null,null,null));
		corporateList.add(new Corporate(3, "Montran", 789,null,null,null,null));
	}

	public List<Corporate> findAllUser() {
		return corporateList;
	}

	public Corporate findUserById(int id) {
		Predicate<? super Corporate> predicate = Corporate -> Corporate.getCorporateId() == id;
		return corporateList.stream().filter(predicate).findFirst().get();
	}

	public List<Corporate> addCorporateInList(Corporate corporate) {
		corporateList.add(corporate);
		return corporateList;
	}
	
	
}
