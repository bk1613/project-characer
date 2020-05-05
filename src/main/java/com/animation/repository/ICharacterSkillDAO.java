package com.animation.repository;

import java.util.List;

import com.animation.model.Characters;
import com.animation.model.Skill;

public interface ICharacterSkillDAO {
	
	public List<Skill> findAll();
	
	public void insert(Skill sk);
}
