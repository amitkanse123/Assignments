package com.amit.sunil;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	service service;

	@PostMapping(value = "/add")
	public User add(@RequestBody User usr) {
		return service.add(usr);
	}

	@GetMapping(value = "/get")
	public List<User> getall() {
		return service.getall();
	}

	@GetMapping(value = "getbyid/{id}")
	public Optional<User> getbyid(@PathVariable int id) {
		return service.getbyid(id);

	}
	 @GetMapping(value = "get/{name}")
	public Optional<User> getbyname(@PathVariable String name) {
		return service.getbyname1(name);

	} 

	@PutMapping(value = "/update")
	public User update(@RequestBody User usr) {
		return service.update(usr);
	}

	@DeleteMapping(value = "delete/{id}")
	public String delete(@PathVariable int id) {
		return service.delete(id);

	}

}
