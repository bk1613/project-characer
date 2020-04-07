package com.revature.repository;

import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Characters;
import com.revature.model.Series;

@Repository
@Transactional
public class AnimeCharacterDAO implements IAnimeCharacterDAO {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public Characters findById(int id) {
		Session s = sf.getCurrentSession();
		return s.get(Characters.class, id);
	}

	@Override
	public List<Characters> findAll() {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		CriteriaQuery<Characters> cq = s.getCriteriaBuilder().createQuery(Characters.class);
		cq.from(Characters.class);
		return s.createQuery(cq).getResultList();
	}

	@Override
	public Characters findBySeries(Series t) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		
		return null;
	}

	@Override
	public void insert(Characters p) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		s.save(p);
	}

	@Override
	public void delete(Characters p) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		s.delete(p);
	}

	@Override
	public void update(Characters p) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		s.update(p);
	}

	@Override
	public Characters findByname(String name) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		return s.get(Characters.class, name);
	}

}
