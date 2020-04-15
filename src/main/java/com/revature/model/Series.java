package com.revature.model;

import java.util.ArrayList;
import java.util.List;
//import java.util.HashSet;
import java.util.Objects;
//import java.util.Set;

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

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Component
@Entity
@Table(name = "SERIES")
public class Series {
	
	@Id
	@Column
	private int series_Id;
	
	@Column(name = "SeriesName", length=100)
	private String series;
	
	@Column(name = "SeriesImage", length=1000)
	private String seriesimage;

	@Column(name = "SeriesDescrip", length=2000)
	private String description;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "series", fetch = FetchType.EAGER)
	private List<Characters> characters = new ArrayList<>();
	
	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Series(int series_Id, String series, String seriesimage, String description, List<Characters> characters) {
		super();
		this.series_Id = series_Id;
		this.series = series;
		this.seriesimage = seriesimage;
		this.description = description;
		this.characters = characters;
	}

	public Series(String series, String seriesimage, String description, List<Characters> characters) {
		super();
		this.series = series;
		this.seriesimage = seriesimage;
		this.description = description;
		this.characters = characters;
	}

	public int getSeries_Id() {
		return series_Id;
	}

	public void setSeries_Id(int series_Id) {
		this.series_Id = series_Id;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getSeriesimage() {
		return seriesimage;
	}

	public void setSeriesimage(String seriesimage) {
		this.seriesimage = seriesimage;
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
		return Objects.hash(characters, description, series, series_Id, seriesimage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Series)) {
			return false;
		}
		Series other = (Series) obj;
		return Objects.equals(characters, other.characters) && Objects.equals(description, other.description)
				&& Objects.equals(series, other.series) && series_Id == other.series_Id
				&& Objects.equals(seriesimage, other.seriesimage);
	}

	@Override
	public String toString() {
		return "Series [series_Id=" + series_Id + ", series=" + series + ", seriesimage=" + seriesimage
				+ ", description=" + description + ", characters=" + characters + "]";
	}
	
		
}
