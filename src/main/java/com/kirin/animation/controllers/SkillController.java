package com.kirin.animation.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirin.animation.model.Skill;
import com.kirin.animation.repository.ICharacterSkillDAO;

@RestController
@RequestMapping(value="skill")
@CrossOrigin
public class SkillController {
	
	private static Logger log = LogManager.getLogger(SkillController.class);
	
	private ICharacterSkillDAO skdao;

	@GetMapping("/characterskill")
	public ResponseEntity<List<Skill>> getAllCharSkill(){
		log.info("Finding all skills");
		return ResponseEntity.status(HttpStatus.OK).body(skdao.findAll());
	}
	
	@PutMapping("/ski/insert")
	public ResponseEntity<List<Skill>> newSkills(@RequestBody Skill s) {
		
		log.info("adding skill");
		skdao.insert(s);
		return ResponseEntity.status(HttpStatus.OK).body(skdao.findAll());
	}
	
	@PutMapping("/ski/delete")
	public  ResponseEntity<List<Skill>> deleteskill(@RequestBody Skill s) {
		
		log.info("adding series");
		skdao.delete(s);
		return ResponseEntity.status(HttpStatus.OK).body(skdao.findAll());
	} 
	
	@Autowired
	public SkillController(ICharacterSkillDAO skdao) {
		super();
		this.skdao = skdao;
	}

	public ICharacterSkillDAO getSkdao() {
		return skdao;
	}

	public void setSkdao(ICharacterSkillDAO skdao) {
		this.skdao = skdao;
	}
	
	
}
