package com.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	public MyRepository repository;

	public Optional<MyEntity> getdata(int id) {
		return repository.findById(id);
	}

	public List<MyEntity> getalldata() {

		return repository.findAll();
	}

}
