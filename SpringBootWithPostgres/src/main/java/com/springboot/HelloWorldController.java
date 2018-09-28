package com.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	public MyService service;

	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}

	@RequestMapping("/print/{id}")
	public Optional<MyEntity> printTable(@PathVariable int id) {

		return service.getdata(id);
	}

	@RequestMapping("/print")
	public List<MyEntity> printTable() {

		return service.getalldata();
	}
}
