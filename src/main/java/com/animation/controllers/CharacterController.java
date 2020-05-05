package com.animation.controllers;

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

import com.animation.model.Characters;
import com.animation.model.Series;
import com.animation.repository.IAnimeCharacterDAO;
import com.animation.repository.IAnimeSeriesDAO;


@RestController
@RequestMapping(value="/character") 
@CrossOrigin
public class CharacterController {
	
//	@Autowired
//	private IAnimeCharacterDAO cdao;
//	
//	@Autowired
//	private IAnimeSeriesDAO sdao;
//	
//	@GetMapping
//	public ResponseEntity<List<Characters>> findAll(){
//		List<Characters> pok = cdao.findAll();
//		if(pok ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(pok);
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<Characters> findById(@PathVariable("id") int id){
//		Characters p = cdao.findById(id);
//		if(p ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(p);
//	}
//	
//	@GetMapping("/{name}")
//	public ResponseEntity<Characters> findByName(@PathVariable("name") String name){
//		Characters p = cdao.findByname(name);
//		if(p ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(p);
//	}
//	
//	@GetMapping("/{series}")
//	public ResponseEntity<Characters> findBySeries(@PathVariable("series") Series s){
//		Characters c = cdao.findBySeries(s);
//		if(c ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(c);
//	}
//	
//	@PutMapping("/update")
//	public ResponseEntity<Characters> update(@RequestBody Characters p){
//		cdao.update(p);
//		if(p ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);
//	}
//	
//	@PutMapping("/delete")
//	public ResponseEntity<Characters> delete(@RequestBody Characters p){
//		cdao.delete(p);
//		if(p ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);
//	}
//	
//	@PostMapping("/insert")
//	public ResponseEntity<List<Series>> insert(@RequestBody Characters c){
//		cdao.insert(c);
//		List<Series> ser = sdao.findAll();
//		if(c ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ser);
//	}
	
}
