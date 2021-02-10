package com.amit.sunil;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	@Autowired
	UserRepo repo;

	public User add(User usr) {
		return repo.save(usr);
	}

	public List<User> getall() {
		return repo.findAll();
	}

	public Optional<User> getbyid(int id) {
		return repo.findById(id);
	}
	
	public Optional<User> getbyname1(String name) {
		return repo.findByName(name);
	} 

	public String delete(int id) {
		repo.deleteById(id);
		return "deleted succesfully" + id;
	}

	public User update(User usr) {
		User usr1 = repo.findById(usr.getId()).orElse(null);
		usr1.setName((usr.getName()));
		usr1.setSalary((usr.getSalary()));
		return repo.save(usr1);

	}

}
