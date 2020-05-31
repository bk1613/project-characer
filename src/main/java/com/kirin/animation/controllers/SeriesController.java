package com.kirin.animation.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirin.animation.model.Series;
import com.kirin.animation.repository.IAnimeSeriesDAO;

@RestController
@RequestMapping(value="/series") 
@CrossOrigin
public class SeriesController {

	private static Logger log = LogManager.getLogger(SeriesController.class);
	
	private IAnimeSeriesDAO sdao;

	@GetMapping("/animeseries")
	public ResponseEntity<List<Series>> getAllSeries(){
		log.info("Finding all series");
		return ResponseEntity.status(HttpStatus.OK).body(sdao.findAll());
	}
	
	@PostMapping("/ser/insert")
	public  ResponseEntity<List<Series>> newSeries(@RequestBody Series s) {
		log.info("adding series");
		sdao.insert(s);
		return ResponseEntity.status(HttpStatus.OK).body(sdao.findAll());
	}
	
	@Autowired
	public SeriesController(IAnimeSeriesDAO sdao) {
		super();
		this.sdao = sdao;
	}
	public IAnimeSeriesDAO getSdao() {
		return sdao;
	}
	public void setSdao(IAnimeSeriesDAO sdao) {
		this.sdao = sdao;
	}
	
}
