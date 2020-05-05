package com.animation.controllers;

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

import com.animation.model.Login;
import com.animation.repository.ILoginDAO;

@RestController
@RequestMapping(value="login")
@CrossOrigin
public class LoginController {
	private static Logger log = LogManager.getLogger(AnimeController.class);
	
	private ILoginDAO ldao;
	
	@GetMapping("/users")
	public ResponseEntity<List<Login>> getAllusers(){
		//System.out.println(cdao.findAll());
		log.info("Finding all characters");
		
		return ResponseEntity.status(HttpStatus.OK).body(ldao.findAll());
	}
	
	@PostMapping("/user/insert")
	public  ResponseEntity<List<Login>> newSeries(@RequestBody Login s) {
		
		log.info("adding series");
		ldao.insert(s);
		return ResponseEntity.status(HttpStatus.OK).body(ldao.findAll());
	}

	@Autowired
	public LoginController(ILoginDAO ldao) {
		super();
		this.ldao = ldao;
	}

	public ILoginDAO getLdao() {
		return ldao;
	}

	public void setLdao(ILoginDAO ldao) {
		this.ldao = ldao;
	}
	
	
	
}
