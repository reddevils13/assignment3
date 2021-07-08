package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.entity.User;
import com.sapient.interfaces.IUSerDAO;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	IUSerDAO iud;
	
	@GetMapping(value="/")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping(value="/id/{id}")
	public User getUser(@PathVariable String id) {
		return iud.getById(id);
	}
	
	@PostMapping(value="/insertuser")
	public User insertUser(User user) {
		return iud.save(user);
	}
	
	@DeleteMapping(value="/deleteuser/{id}")
	public String deleteUser(@PathVariable String id) {
		iud.deleteById(id);
		return "delete successful";
	}
	
	@PutMapping(value="/update/id/{id}")
	public User updateUser(User user) {
		return iud.save(user);
	}
	
	
	
	
	
	
}
