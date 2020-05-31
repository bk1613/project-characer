package com.kirin.animation.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

import com.kirin.animation.model.Characters;
import com.kirin.animation.model.Series;
import com.kirin.animation.repository.IAnimeCharacterDAO;
import com.kirin.animation.repository.IAnimeSeriesDAO;


@RestController
@RequestMapping(value="/character") 
@CrossOrigin
public class CharacterController {
	
	private static Logger log = LogManager.getLogger(CharacterController.class);
	
	private IAnimeCharacterDAO cdao;

	@GetMapping("/animecharacter")
	public ResponseEntity<List<Characters>> getAllCharacters(){
		log.info("Finding all characters");
		Series s = cdao.findById(19).getSeries();
		System.out.println(s.getsId());
		return ResponseEntity.status(HttpStatus.OK).body(cdao.findAll());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Characters> getCharacterbyname(@PathVariable("id") int id) {
		return ResponseEntity.status(HttpStatus.OK).body(cdao.findById(id));
	}
	
	@PutMapping("/char/insert")
	public ResponseEntity<List<Characters>> newCharacter(@RequestBody Characters c) {
		log.info("adding character");
		cdao.insert(c);
		return ResponseEntity.status(HttpStatus.OK).body(cdao.findAll());
	}
	
	@PutMapping("char/delete")
	public  ResponseEntity<List<Characters>> deleteChar(@RequestBody Characters c) {
		log.info("delete characters");
		cdao.delete(c);
		return ResponseEntity.status(HttpStatus.OK).body(cdao.findAll());
	} 
	
	@PostMapping("char/update")
	public  ResponseEntity<List<Characters>> UpdateChar(@RequestBody Characters c) {
		log.info("update characters");
		cdao.update(c);
		return ResponseEntity.status(HttpStatus.OK).body(cdao.findAll());
	} 
	
	@Autowired
	public CharacterController(IAnimeCharacterDAO cdao) {
		super();
		this.cdao = cdao;
	}

	public IAnimeCharacterDAO getCdao() {
		return cdao;
	}

	public void setCdao(IAnimeCharacterDAO cdao) {
		this.cdao = cdao;
	}
	
	
}
