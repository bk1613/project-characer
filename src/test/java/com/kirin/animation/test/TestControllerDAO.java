package com.kirin.animation.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kirin.animation.model.Characters;
import com.kirin.animation.model.Series;
import com.kirin.animation.repository.AnimeCharacterDAO;
import com.kirin.animation.repository.AnimeSeriesDAO;
import com.kirin.animation.repository.CharacterSkillDAO;



public class TestControllerDAO {
	//private AnimeController ac = null;
	private AnimeCharacterDAO cdao = null;
//	private AnimeSeriesDAO sdao = null;
//	private CharacterSkillDAO skdao = null;
//	
//	@Autowired
//	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		cdao = new AnimeCharacterDAO();
//		sdao = new AnimeSeriesDAO();
//		skdao = new CharacterSkillDAO();
		//ac = new AnimeController(cdao, sdao, skdao);
	}

	@Test
	public void testfinAll() {
		
//		for(Characters c:cdao.findAll()) {
			
//		}
//		for(Characters c: cdao.findAll()) {
//			if(c.getCharId() == 19) {
//				assertEquals("Kenshiro", c.getName());
//			}
//		}
		
	}

	@Test
	public void testinsert() {
//		Series s = new Series(0, "series name", "simage", "sdesc", new ArrayList<>());
//		cdao.insert(new Characters("AyyLmao", 
//				"image", 
//				"male", 
//				new ArrayList<>(),
//				"ability", 
//				"description", 
//				"rank", 
//				s));
		
	}
}
