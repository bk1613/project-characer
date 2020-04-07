package com.revature.model;

import java.util.ArrayList;
import java.util.List;
//import java.util.HashSet;
import java.util.Objects;
//import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "SERIES")
public class Series {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int series_Id;
	
	@Column(name = "SeriesName")
	private AnimeSeries series;

	@Column(name = "SeriesDescrip")
	private String description;
	
	@OneToMany(mappedBy = "trainer", fetch = FetchType.EAGER)
	private List<Characters> characters = new ArrayList<>();
	
	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Series(int series_Id, AnimeSeries series, String description, List<Characters> characters) {
		super();
		this.series_Id = series_Id;
		this.series = series;
		this.description = description;
		this.characters = characters;
	}

	public Series(AnimeSeries series, String description, List<Characters> characters) {
		super();
		this.series = series;
		this.description = description;
		this.characters = characters;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Characters> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Characters> characters) {
		this.characters = characters;
	}

	@Override
	public int hashCode() {
		return Objects.hash(characters, description, series, series_Id);
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
		return Objects.equals(characters, other.characters) && Objects.equals(description, other.description)
				&& series == other.series && series_Id == other.series_Id;
	}

	@Override
	public String toString() {
		return "Series [series_Id=" + series_Id + ", series=" + series + ", description=" + description
				+ ", characters=" + characters + "]";
	}

	
		
}
