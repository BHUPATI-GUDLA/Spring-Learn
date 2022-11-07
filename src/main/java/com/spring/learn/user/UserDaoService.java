package com.spring.learn.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> userList = new ArrayList<User>();

	static {
		userList.add(new User(1, "Ravi Varma", LocalDate.now().minusYears(30)));
		userList.add(new User(2, "Suresh Sham", LocalDate.now().minusYears(50)));
		userList.add(new User(3, "Ramu Sharma", LocalDate.now().minusYears(20)));
	}

	public List<User> findAllUser() {
		return userList;
	}

	public User findUserById(int id) {
		for (User user : userList) {
			if (user.getUserId() == id) {
				return user;
			}
		}  
		return null;
	}
	
	
	public User findUserByStream(int id) {
		Predicate<? super User> predicate = user -> user.getUserId() == id;
		return userList.stream().filter(predicate).findFirst().get();
		
	}
}
