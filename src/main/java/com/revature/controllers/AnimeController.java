package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Characters;
import com.revature.model.Series;
import com.revature.model.Skill;
import com.revature.repository.IAnimeCharacterDAO;
import com.revature.repository.IAnimeSeriesDAO;
import com.revature.repository.ICharacterSkillDAO;

@RestController
@RequestMapping(value="anime")
@CrossOrigin
public class AnimeController {

	private IAnimeCharacterDAO cdao;
	private IAnimeSeriesDAO sdao;
	private ICharacterSkillDAO skdao;
	
	@GetMapping("/animecharacter")
	public ResponseEntity<List<Characters>> getAllCharacters(){
		//System.out.println(cdao.findAll());
		System.out.println("Finding all characters");
		Series s = cdao.findById(19).getSeries();
		System.out.println(s.getsId());
		return ResponseEntity.status(HttpStatus.OK).body(cdao.findAll());
	}
	
	@GetMapping("/characterskill")
	public ResponseEntity<List<Skill>> getAllCharSkill(){
		return ResponseEntity.status(HttpStatus.OK).body(skdao.findAll());
	}
	
	@GetMapping("/animeseries")
	public ResponseEntity<List<Series>> getAllSeries(){
		System.out.println();
		return ResponseEntity.status(HttpStatus.OK).body(sdao.findAll());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Characters> getCharacterbyname(@PathVariable("id") int id) {
		return ResponseEntity.status(HttpStatus.OK).body(cdao.findById(id));
	}
	
	@PostMapping("/ser/insert")
	public  ResponseEntity<List<Series>> newSeries(@RequestBody Series s) {
		System.out.println("adding series");
		System.out.println(s.getsId());
		System.out.println(s.getDescription());
		System.out.println(s.getName());
		sdao.insert(s);
		return ResponseEntity.status(HttpStatus.OK).body(sdao.findAll());
	}
	
	@PutMapping("/char/insert")
	public ResponseEntity<List<Characters>> newCharacter(@RequestBody Characters c) {
		System.out.println(c.getSeries().getsId());
		System.out.println("adding character");
		cdao.insert(c);
		return ResponseEntity.status(HttpStatus.OK).body(cdao.findAll());
	}
	
	@PutMapping("/ski/insert")
	public  ResponseEntity<List<Skill>> newSkills(@RequestBody Skill s) {
		System.out.println(s.getSkillname());
		System.out.println(s.getCharacter().getName());
		skdao.insert(s);
		return ResponseEntity.status(HttpStatus.OK).body(skdao.findAll());
	}
	
	@Autowired
	public AnimeController(IAnimeCharacterDAO cdao, IAnimeSeriesDAO sdao, ICharacterSkillDAO skdao) {
		super();
		this.cdao = cdao;
		this.sdao = sdao;
		this.skdao = skdao;
	}

	public IAnimeCharacterDAO getCdao() {
		return cdao;
	}

	public void setCdao(IAnimeCharacterDAO cdao) {
		this.cdao = cdao;
	}

	public IAnimeSeriesDAO getSdao() {
		return sdao;
	}

	public void setSdao(IAnimeSeriesDAO sdao) {
		this.sdao = sdao;
	}

	public ICharacterSkillDAO getSkdao() {
		return skdao;
	}

	public void setSkdao(ICharacterSkillDAO skdao) {
		this.skdao = skdao;
	}
}
