package com.revature.repository;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Skill;

@Repository
@Transactional
public class CharacterSkillDAO implements ICharacterSkillDAO {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public List<Skill> findAll() {
		Session s = sf.getCurrentSession();
		CriteriaQuery<Skill> cq = s.getCriteriaBuilder().createQuery(Skill.class);
		cq.from(Skill.class);
		return s.createQuery(cq).getResultList();
	}

	@Override
	public void insert(Skill sk) {
		Session s = sf.getCurrentSession();
		s.save(sk);
	}

}
