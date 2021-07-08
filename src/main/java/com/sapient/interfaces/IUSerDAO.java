package com.sapient.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.entity.User;

public interface IUSerDAO extends JpaRepository<User, String> {

	
}
