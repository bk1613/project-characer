package com.revature.repository;

import java.util.List;

import com.revature.model.AnimeSeries;
import com.revature.model.Series;

public interface IAnimeSeriesDAO {

	public Series findById(int id);
	
	public List<Series> findAll();
	
	public Series findByname(AnimeSeries name);
	
}
