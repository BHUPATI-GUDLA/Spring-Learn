package com.spring.learn.DB;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.spring.learn.user.Corporate;
import com.spring.learn.user.User;

@Component
public class UserDB {

	public static List<User> userList = new ArrayList<User>();

	static {
		userList.add(new User(1, "Ravi Varma", LocalDate.now().minusYears(30)));
		userList.add(new User(2, "Suresh Sham", LocalDate.now().minusYears(50)));
		userList.add(new User(3, "Ramu Sharma", LocalDate.now().minusYears(20)));
	}

	public static List<Corporate> corporateList = new ArrayList<Corporate>();

	static {
		corporateList.add(new Corporate(1, "Airtel", 123, null, null, null, null));
		corporateList.add(new Corporate(2, "Bajaj Finance", 456, null, null, null, null));
		corporateList.add(new Corporate(3, "Montran", 789, null, null, null, null));
	}

	private User findUserById(int id) {
		Predicate<? super User> predicate = user -> user.getUserId() == id;
		return userList.stream().filter(predicate).findFirst().get();

	}

	private Corporate findCorporateById(int id) {
		Predicate<? super Corporate> predicate = corpo -> corpo.getCorporateId() == id;
		return corporateList.stream().filter(predicate).findFirst().get();

	}

}
