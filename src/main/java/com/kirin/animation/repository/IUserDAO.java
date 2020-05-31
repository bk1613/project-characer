package com.kirin.animation.repository;

import java.util.List;

import com.kirin.animation.model.User;

public interface IUserDAO {
	public void insert(User l);
	
	public List<User> findAll();
}
