package com.animation.repository;

import java.util.List;

import com.animation.model.Login;

public interface ILoginDAO {
	public void insert(Login l);
	
	public List<Login> findAll();
}
