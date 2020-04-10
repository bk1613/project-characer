package com.revature.repository;

import java.util.List;

import com.revature.model.Characters;
import com.revature.model.Skill;

public interface ICharacterSkillDAO {
	
	public List<Skill> findAll();
	
	public void insert(Skill sk);
}
