package com.sapient.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.entity.User;
import com.sapient.interfaces.IUSerDAO;

@RestController
//@RequestMapping("/api")
public class UserController {
	
	@Autowired
	IUSerDAO iud;
	
	@GetMapping(value="/api")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping(value="/api/show")
	public List<User> showAll() {
		return iud.findAll();
	}
	
	@GetMapping(value="/id/{id}")
	public User getUser(@PathVariable Integer id) {
		return iud.getById(id);
	}
	
	@PostMapping(value="/api/insertuser")
	public User insertUser(@RequestBody User user) {
		return iud.save(user);
	}
	
	@DeleteMapping(value="/api/deleteuser/{id}")
	public String deleteUser(@PathVariable Integer id) {
		iud.deleteById(id);
		return "delete successful";
	}
	
	@PutMapping(value="/api/update/id/{id}")
	public User updateUser(User user) {
		return iud.save(user);
	}
	
	
	
	
	
	
}
