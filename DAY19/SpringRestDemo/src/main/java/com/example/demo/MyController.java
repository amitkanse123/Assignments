package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
List<Employee> list=new ArrayList<>();

EmpRepo repo=new EmpRepo();


empservice emp=new empservice();


@GetMapping(value="/all")
public List<Employee> getall()
{

	return emp.getall();
	
}
@PostMapping(value="/insert")
public Employee insertall( @RequestBody Employee  e)
{
	emp.addEmployee(e);
	System.out.println(e);
	return e;
	
}

@PutMapping(value="/update")
public  Employee update(@RequestBody Employee  e)
{
	repo.update(e);
	return e;
}
@PutMapping(value="/delete")
public  Employee delete(@RequestBody Employee  e)
{
	repo.delete(e);
	return e;
}
@GetMapping(value = "/emp/{id}")
public Employee getEmp(@PathVariable("id") Integer id) {

	System.out.println(id);
	return repo.getEmployee(id);
}

}
