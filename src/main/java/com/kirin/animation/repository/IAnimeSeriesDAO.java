package com.kirin.animation.repository;

import java.util.List;

import com.kirin.animation.model.Series;

public interface IAnimeSeriesDAO {

	public Series findById(int id);
	
	public List<Series> findAll();
	
	public Series findByname(String name);
	
	public void insert(Series p);
	
	public void delete(Series p);
	
	public void update(Series p);
	
}
