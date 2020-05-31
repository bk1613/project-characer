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
	private String skillname;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "charId")
	private Characters character;

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(int skillId, String skillname, Characters character) {
		super();
		this.skillId = skillId;
		this.skillname = skillname;
		this.character = character;
	}

	public Skill(String skillname, Characters character) {
		super();
		this.skillname = skillname;
		this.character = character;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	public Characters getCharacter() {
		return character;
	}

	public void setCharacter(Characters character) {
		this.character = character;
	}

	@Override
	public int hashCode() {
		return Objects.hash(character, skillId, skillname);
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
		return Objects.equals(character, other.character) && skillId == other.skillId
				&& Objects.equals(skillname, other.skillname);
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillname=" + skillname + ", character=" + character + "]";
	}

	
	
}
