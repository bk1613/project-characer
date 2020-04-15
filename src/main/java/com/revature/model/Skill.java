package com.revature.model;

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
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Component
@Entity
@Table(name = "SKILLS")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int skillId;
	
	@Column(name = "skill")
	private String skill;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "charId")
	private Characters chara;

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(int skillId, String skill) {
		super();
		this.skillId = skillId;
		this.skill = skill;
	}

	public Skill(String skill) {
		super();
		this.skill = skill;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public int hashCode() {
		return Objects.hash(skill, skillId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Skill)) {
			return false;
		}
		Skill other = (Skill) obj;
		return Objects.equals(skill, other.skill) && skillId == other.skillId;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skill=" + skill + "]";
	}
	
	
}
