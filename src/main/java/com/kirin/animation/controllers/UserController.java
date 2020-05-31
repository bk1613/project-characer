package com.kirin.animation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirin.animation.model.User;
import com.kirin.animation.repository.IUserDAO;

@RestController
@RequestMapping(value="user")
@CrossOrigin
public class UserController {
	
	private IUserDAO ldao;
	
	@GetMapping("/animeusers")
	public ResponseEntity<List<User>> getAllusers(){
		//System.out.println(cdao.findAll());
		//log.info("Finding all characters");
		
		return ResponseEntity.status(HttpStatus.OK).body(ldao.findAll());
	}
	
	@PostMapping("sub/insert")
	public  ResponseEntity<List<User>> newSeries(@RequestBody User s) {
		
		//log.info("adding series");
		ldao.insert(s);
		return ResponseEntity.status(HttpStatus.OK).body(ldao.findAll());
	}

	@Autowired
	public UserController(IUserDAO ldao) {
		super();
		this.ldao = ldao;
	}

	public IUserDAO getLdao() {
		return ldao;
	}

	public void setLdao(IUserDAO ldao) {
		this.ldao = ldao;
	}

	
	
}
