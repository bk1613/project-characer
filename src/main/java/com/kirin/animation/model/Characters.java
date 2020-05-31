package com.kirin.animation.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Component
@Entity
@Table(name = "CHARACTERS")
public class Characters {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int CharId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "gender")
	private String gender;
	//mappedBy = "skill"
	@JsonManagedReference
	@OneToMany(mappedBy = "character", fetch = FetchType.EAGER)
	private List<Skill> skills = new ArrayList<>();
	
	@Column(name = "special")
	private String special;
	
	@Column(name = "profile")
	private String profile;
	
	@Column(name = "rank")
	private String rank;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "series_id")
//	@Column(name = "series_id")
	private Series series;
	
	public Characters() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Characters(int charId, String name, String image, String gender, List<Skill> skills, String special,
			String profile, String rank, Series series) {
		super();
		CharId = charId;
		this.name = name;
		this.image = image;
		this.gender = gender;
		this.skills = skills;
		this.special = special;
		this.profile = profile;
		this.rank = rank;
		this.series = series;
	}

	public Characters(String name, String image, String gender, List<Skill> skills, String special, String profile,
			String rank, Series series) {
		super();
		this.name = name;
		this.image = image;
		this.gender = gender;
		this.skills = skills;
		this.special = special;
		this.profile = profile;
		this.rank = rank;
		this.series = series;
	}

	public int getCharId() {
		return CharId;
	}

	public void setCharId(int charId) {
		CharId = charId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
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

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CharId, gender, image, name, profile, rank, series, skills, special);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Characters)) {
			return false;
		}
		Characters other = (Characters) obj;
		return CharId == other.CharId && Objects.equals(gender, other.gender) && Objects.equals(image, other.image)
				&& Objects.equals(name, other.name) && Objects.equals(profile, other.profile)
				&& Objects.equals(rank, other.rank) && Objects.equals(series, other.series)
				&& Objects.equals(skills, other.skills) && Objects.equals(special, other.special);
	}

	@Override
	public String toString() {
		return "Characters [CharId=" + CharId + ", name=" + name + ", image=" + image + ", gender=" + gender
				+ ", skills=" + skills + ", special=" + special + ", profile=" + profile + ", rank=" + rank
				+ ", series=" + series + "]";
	}

}
