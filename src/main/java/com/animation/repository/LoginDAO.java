package com.animation.repository;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.animation.model.Login;

@Repository
@Transactional
public class LoginDAO implements ILoginDAO {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void insert(Login l) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		s.save(l);
	}

	@Override
	public List<Login> findAll() {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		CriteriaQuery<Login> lq = s.getCriteriaBuilder().createQuery(Login.class);
		lq.from(Login.class);
		return s.createQuery(lq).getResultList();
	}

}
