package com.sapient.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sapient.entity.User;

@Service
public interface IUSerDAO extends JpaRepository<User, Integer> {

	
}
