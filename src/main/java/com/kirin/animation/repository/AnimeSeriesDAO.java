package com.kirin.animation.repository;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kirin.animation.model.Characters;
import com.kirin.animation.model.Series;

@Repository
@Transactional
public class AnimeSeriesDAO implements IAnimeSeriesDAO {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public Series findById(int id) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		return s.get(Series.class, id);
	}

	@Override
	public List<Series> findAll() {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		CriteriaQuery<Series> cq = s.getCriteriaBuilder().createQuery(Series.class);
		cq.from(Series.class);
		return s.createQuery(cq).getResultList();
	}

	@Override
	public Series findByname(String name) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		return s.get(Series.class, name);
	}

	@Override
	public void insert(Series se) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(se);

	}

	@Override
	public void delete(Series se) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		s.delete(se);

	}

	@Override
	public void update(Series se) {
		// TODO Auto-generated method stub
		Session s = sf.getCurrentSession();
		s.update(se);

	}

}
