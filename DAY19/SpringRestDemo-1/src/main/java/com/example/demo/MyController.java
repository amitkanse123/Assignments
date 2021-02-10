package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


Empservice emp=new Empservice();
	@PostMapping(value="/insert")
	public Employee insert(Employee e)
	{
	emp.add(e);
		return e;
		
	}
	//@GetMapping(value="/getall")
/*	public void getall(@ResponseBody Employee e)
	{
		
	}  */
	
}
	