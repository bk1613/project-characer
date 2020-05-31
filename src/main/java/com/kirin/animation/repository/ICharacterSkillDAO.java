package com.kirin.animation.repository;

import java.util.List;

import com.kirin.animation.model.Characters;
import com.kirin.animation.model.Skill;

public interface ICharacterSkillDAO {
	
	public List<Skill> findAll();
	
	public void insert(Skill sk);
	
	public void delete(Skill sk);
}
