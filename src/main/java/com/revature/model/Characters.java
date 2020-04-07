package com.revature.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



//@NamedQueries({
//	@NamedQuery(name = "getAll", query = "FROM Characters"),
//	//@NamedQuery(name = "getSeries", query = "FROM Pokemon WHERE name = 'Bulbasaur'")
//})

@Component
@Entity
@Table(name = "CHARACTERS")
public class Characters {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int charId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "skill_set")
	private String skill;
	
	@Column(name = "special_ability")
	private String special;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "profile")
	private String profile;
	
	@Column(name = "rank")
	private String rank;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "series_id")
	private Series series;
	
	public Characters() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Characters(int charId, String name, Series series, String skill, String special, String image,
			String profile, String rank) {
		super();
		this.charId = charId;
		this.name = name;
		this.series = series;
		this.skill = skill;
		this.special = special;
		this.image = image;
		this.profile = profile;
		this.rank = rank;
	}

	
	public Characters(String name, String skill, String special, String image, String profile, String rank,
			Series series) {
		super();
		this.name = name;
		this.skill = skill;
		this.special = special;
		this.image = image;
		this.profile = profile;
		this.rank = rank;
		this.series = series;
	}

	public int getCharId() {
		return charId;
	}

	public void setCharId(int charId) {
		this.charId = charId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public int hashCode() {
		return Objects.hash(charId, image, name, profile, rank, series, skill, special);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Characters other = (Characters) obj;
		return charId == other.charId && Objects.equals(image, other.image) && Objects.equals(name, other.name)
				&& Objects.equals(profile, other.profile) && Objects.equals(rank, other.rank)
				&& Objects.equals(series, other.series) && Objects.equals(skill, other.skill)
				&& Objects.equals(special, other.special);
	}

	@Override
	public String toString() {
		return "Characters [charId=" + charId + ", name=" + name + ", series=" + series + ", skill=" + skill
				+ ", special=" + special + ", image=" + image + ", profile=" + profile + ", rank=" + rank + "]";
	}

	
	
	
}
