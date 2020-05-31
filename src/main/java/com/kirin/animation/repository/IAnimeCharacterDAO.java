package com.kirin.animation.repository;

import java.util.List;

import com.kirin.animation.model.Characters;
import com.kirin.animation.model.Series;


public interface IAnimeCharacterDAO {

	public Characters findById(int id);
	
	public List<Characters> findAll();
	
	public Characters findBySeries(Series t);
	
	public void insert(Characters p);
	
	public void delete(Characters c);
	
	public void update(Characters p);
	
}
