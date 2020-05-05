package com.animation.repository;

import java.util.List;
import java.util.Set;

import com.animation.model.Characters;
import com.animation.model.Series;

public interface IAnimeCharacterDAO {

	public Characters findById(int id);
	
	public List<Characters> findAll();
	
	public Characters findBySeries(Series t);
	
	public void insert(Characters p);
	
	public void delete(Characters p);
	
	public void update(Characters p);
	
}
