package com.kirin.animation.repository;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kirin.animation.model.User;

@Repository
@Transactional
public class UserDAO implements IUserDAO {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void insert(User l) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		s.save(l);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		CriteriaQuery<User> lq = s.getCriteriaBuilder().createQuery(User.class);
		lq.from(User.class);
		return s.createQuery(lq).getResultList();
	}

}
