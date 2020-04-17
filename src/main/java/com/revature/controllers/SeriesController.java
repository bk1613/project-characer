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
import com.revature.repository.IAnimeCharacterDAO;
import com.revature.repository.IAnimeSeriesDAO;

@RestController
@RequestMapping(value="/series") 
@CrossOrigin
public class SeriesController {

//	@Autowired
//	private IAnimeSeriesDAO sdao;
//	
//	@Autowired
//	private IAnimeCharacterDAO cdao;
//	
//	@GetMapping
//	public ResponseEntity<List<Series>> findAll(){
//		List<Series> ser = sdao.findAll();
//		if(ser ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(ser);
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<Series> findById(@PathVariable("id") int id){
//		Series s = sdao.findById(id);
//		if(s ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(s);
//	}
//	
//	@GetMapping("/{name}")
//	public ResponseEntity<Series> findByname(@PathVariable("name") String name){
//		Series s = sdao.findByname(name);
//		if(s ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(s);
//	}
//	
//	@PutMapping("/update")
//	public ResponseEntity<Series> update(@RequestBody Series p){
//		sdao.update(p);
//		if(p ==null) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);
//	}
//	
//	@PutMapping("/delete")
//	public ResponseEntity<Series> delete(@RequestBody Series p){
//		sdao.delete(p);
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
