package com.kirin.animation.model;

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
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int sId;
	
	@Column(name = "SeriesName", length=100)
	private String name;
	
	@Column(name = "SeriesImage", length=1000)
	private String image;

	@Column(name = "SeriesDescrip", length=2000)
	private String description;
	
	//mappedBy = "series",
	
	@JsonManagedReference
	@OneToMany(mappedBy = "series", fetch = FetchType.EAGER)
	private List<Characters> characters = new ArrayList<>();
	
	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Series(int sId, String name, String image, String description, List<Characters> characters) {
		super();
		this.sId = sId;
		this.name = name;
		this.image = image;
		this.description = description;
		this.characters = characters;
	}

	public Series(String name, String image, String description, List<Characters> characters) {
		super();
		this.name = name;
		this.image = image;
		this.description = description;
		this.characters = characters;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
		return Objects.hash(characters, description, image, name, sId);
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
				&& Objects.equals(image, other.image) && Objects.equals(name, other.name) && sId == other.sId;
	}

	@Override
	public String toString() {
		return "Series [sId=" + sId + ", name=" + name + ", image=" + image + ", description=" + description
				+ ", characters=" + characters + "]";
	}
		
}
