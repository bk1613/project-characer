package com.revature.model;

import java.util.List;
//import java.util.HashSet;
import java.util.Objects;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "SKILLSET")
public class SkillSet {
	
	@Id
	private int skill_Id;
	
	@Column(name = "skill_list")
	private String skills;
	
//	@JsonBackReference
//	private List<Characters> userItems;

	public SkillSet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SkillSet(int skill_Id, String skills) {
		super();
		this.skill_Id = skill_Id;
		this.skills = skills;
	}

	public int getSkill_Id() {
		return skill_Id;
	}

	public void setSkill_Id(int skill_Id) {
		this.skill_Id = skill_Id;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public int hashCode() {
		return Objects.hash(skill_Id, skills);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SkillSet other = (SkillSet) obj;
		return skill_Id == other.skill_Id && Objects.equals(skills, other.skills);
	}

	@Override
	public String toString() {
		return "SkillSet [skill_Id=" + skill_Id + ", skills=" + skills + "]";
	}
	

}
