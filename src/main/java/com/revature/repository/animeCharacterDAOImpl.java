package com.revature.repository;

import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.revature.model.AnimeSeries;
import com.revature.model.Characters;
import com.revature.model.Series;
import com.revature.model.SkillSet;
import com.revature.util.hibernateUtil;


@Repository
public class animeCharacterDAOImpl implements animeCharacterDAO{

	@Override
	public Characters findById(int id) {
		// TODO Auto-generated method stub
		Session ses = hibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		Characters c = ses.get(Characters.class, id);
		
		tx.commit();
		hibernateUtil.closeSession();
		
		return c;
	}

	@Override
	public Set<Characters> findAll() {
		// TODO Auto-generated method stub
		
		Set<Characters> set = null;
		
		Session ses = hibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		CriteriaBuilder builder = ses.getCriteriaBuilder();
		CriteriaQuery<Characters> query = builder.createQuery(Characters.class);
		Root<Characters> root = query.from(Characters.class);
		query.select(root);
		
		Query<Characters> q = ses.createQuery(query);
		
		set = q.getResultStream()
				.collect(Collectors.toSet());
		
		tx.commit();
		
		return set;
	}

	@Override
	public Set<Characters> findBySeries(Series t) {
		// TODO Auto-generated method stub
		Set<Characters> set = null;
		
		Session ses = hibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		CriteriaBuilder builder = ses.getCriteriaBuilder();
		CriteriaQuery<Characters> query = builder.createQuery(Characters.class);
		
		Root<Characters> root = query.from(Characters.class);
		
		query.select(root).where(builder.equal(root.get("series"), t));
		
		Query<Characters> q = ses.createQuery(query);
		
		set = q.getResultStream()
				.collect(Collectors.toSet());
		
		tx.commit();
		
		return set;
	}

	@Override
	public Set<Characters> findBySkill(SkillSet t) {
		// TODO Auto-generated method stub
		Set<Characters> set = null;
		
		Session ses = hibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		CriteriaBuilder builder = ses.getCriteriaBuilder();
		CriteriaQuery<Characters> query = builder.createQuery(Characters.class);
		
		Root<Characters> root = query.from(Characters.class);
		
		query.select(root).where(builder.equal(root.get("skill"), t));
		
		Query<Characters> q = ses.createQuery(query);
		
		set = q.getResultStream()
				.collect(Collectors.toSet());
		
		tx.commit();
		
		return set;
	}

	@Override
	public void insert(Characters p) {
		// TODO Auto-generated method stub
		Session ses = hibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(p);
		tx.commit();
		hibernateUtil.closeSession();
	}

	@Override
	public void delete(Characters p) {
		// TODO Auto-generated method stub
		Session ses = hibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.delete(p);
		tx.commit();
		hibernateUtil.closeSession();
		
	}

	@Override
	public void update(Characters p) {
		// TODO Auto-generated method stub
		Session ses = hibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.update(p);
		tx.commit();
		hibernateUtil.closeSession();
		
	}

//	@Override
//	public Set<Characters> findByType(AnimeSeries name) {
//		// TODO Auto-generated method stub
//		Set<Characters> set = null;
//		
//		Session ses = hibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		
//		CriteriaBuilder builder = ses.getCriteriaBuilder();
//		CriteriaQuery<Characters> query = builder.createQuery(Characters.class);
//		
//		Root<Characters> root = query.from(Characters.class);
//		
//		query.select(root).where(builder.equal(root.get("series"), name));
//		
//		Query<Characters> q = ses.createQuery(query);
//		
//		set = q.getResultStream()
//				.collect(Collectors.toSet());
//		
//		tx.commit();
//		
//		return set;
//	}

}
