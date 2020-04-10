package com.revature.repository;

import com.revature.model.Characters;

import java.util.List;
import java.util.Set;

import com.revature.model.Series;

public interface IAnimeCharacterDAO {

	public Characters findById(int id);
	
	public List<Characters> findAll();
	
	public Characters findBySeries(Series t);
	
	public void insert(Characters p);
	
	public void delete(Characters p);
	
	public void update(Characters p);
	
	public Characters findByname(String name);
	
}
