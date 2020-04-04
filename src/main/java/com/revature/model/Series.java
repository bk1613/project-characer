package com.revature.model;

import java.util.List;
//import java.util.HashSet;
import java.util.Objects;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "SERIES")
public class Series {
	
	@Id
	private int series_Id;
	
	@Column(name = "SeriesName")
	private AnimeSeries series;

//	@JsonBackReference
//	private List<Characters> userItems;
	
	
	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Series(int series_Id, AnimeSeries series) {
		super();
		this.series_Id = series_Id;
		this.series = series;
	}

	public int getSeries_Id() {
		return series_Id;
	}

	public void setSeries_Id(int series_Id) {
		this.series_Id = series_Id;
	}

	public AnimeSeries getSeries() {
		return series;
	}

	public void setSeries(AnimeSeries series) {
		this.series = series;
	}

	@Override
	public int hashCode() {
		return Objects.hash(series, series_Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Series other = (Series) obj;
		return series == other.series && series_Id == other.series_Id;
	}

	@Override
	public String toString() {
		return "Series [series_Id=" + series_Id + ", series=" + series + "]";
	}
	
	
	
}
