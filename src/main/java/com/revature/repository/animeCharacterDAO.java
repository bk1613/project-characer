package com.revature.repository;

import com.revature.model.Characters;

import java.util.Set;

import com.revature.model.AnimeSeries;
import com.revature.model.Series;
import com.revature.model.SkillSet;

public interface animeCharacterDAO {

	public Characters findById(int id);
	
	public Set<Characters> findAll();
	
	public Set<Characters> findBySeries(Series t);
	
	public Set<Characters> findBySkill(SkillSet t);
	
	public void insert(Characters p);
	
	public void delete(Characters p);
	
	public void update(Characters p);
	
	
	
}
