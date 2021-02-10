package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmpRepo {
	List<Employee> list = new ArrayList<Employee>();

	public void insert(Employee e) {
		list.add(e);
	}

	public void delete(Employee e) {
		list.remove(e);
	}

	public void update(Employee e) {
		list.set(list.indexOf(e), e);
	}

	public List<Employee> getAll() {
		return list;
	}

	public Employee getEmployee(Integer empid) {
		Employee temp = null;
		for (Employee e : list) {
			if (e.getEid() == empid)
				temp = e;
		}
		return temp;
	}
	}


