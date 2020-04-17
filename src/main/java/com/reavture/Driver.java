package com.reavture;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.model.Characters;
import com.revature.model.Series;
import com.revature.model.Skill;
import com.revature.repository.IAnimeCharacterDAO;
import com.revature.repository.IAnimeSeriesDAO;
import com.revature.repository.ICharacterSkillDAO;

public class Driver {

	public static void main(String[] args) {
		/*
		 * Table Hierarchy
		 * 						 _________________________________________
		 * Series				|										  |
		 * 	 ||					| Need to follow this order of inserting, |
		 * 	 ||					| and reverse for deleting, otherwise  	  |
		 * 	 \/					| there is integrity constraint			  |
		 * Character			|_________________________________________|
		 * 	 ||
		 * 	 ||
		 * 	 \/
		 * Skill
		 * 
		 */
		
		/*
		 * Steps to follow in order to fetch from database:
		 * 
		 * To find Series
		 * 	- Do findAll() to fetch all Series and display them
		 * To find specific Series
		 * 	- Do findById to fetch that particular Series
		 * 
		 * To find Character(s)
		 * 	- Do findBySeries() to fetch characters after doing [SeriesDAO].findById()
		 * To find specific Character
		 * 	- Do findById to fetch that particular Character
		 * 
		 * To find Skills
		 * 	- Do findById to fetch skills for that particular Character after doing [CharacterDAO].findById()
		 * 
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
		IAnimeCharacterDAO cdao = ac.getBean(IAnimeCharacterDAO.class);
//		
		IAnimeSeriesDAO adao = ac.getBean(IAnimeSeriesDAO.class);
		cdao.findAll();
		Characters c = new Characters();
		c = cdao.findById(19);
		System.out.println(c.getSeries().getsId());
		System.out.println("finish");
//		
//		System.out.println(adao.findAll());
//		
//		Series s = new Series(0, "series name", "simage", "sdesc", new ArrayList<>());
//		
//		adao.insert(s);
//		
//		System.out.println("sending data...");
//		
//		cdao.insert(new Characters("AyyLmao", 
//		"image", 
//		"male", 
//		new ArrayList<>(),
//		//sk,
//		"ability", 
//		"description", 
//		"rank", 
//		s));
//		
//		System.out.println("sending data.");
		
		
		
	}
}
