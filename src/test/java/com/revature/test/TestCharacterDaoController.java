package com.revature.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.revature.controllers.AnimeController;
import com.revature.model.Characters;
import com.revature.model.Series;
import com.revature.repository.AnimeCharacterDAO;
import com.revature.repository.AnimeSeriesDAO;
import com.revature.repository.CharacterSkillDAO;

public class TestCharacterDaoController {
	private AnimeController ac = null;
	private AnimeSeriesDAO sd;
	private AnimeCharacterDAO ach;
	private CharacterSkillDAO csk;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sd = new AnimeSeriesDAO();
		ach = new AnimeCharacterDAO();
		csk = new CharacterSkillDAO();
		ac = new AnimeController(ach, sd, csk);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testcharacfindall() {
		for(Characters ca : ach.findAll()) {
			if(ca.getCharId() == 19) {
				assertEquals("Kenshiro", ca.getName());
				assertEquals("https://vignette.wikia.nocookie.net/hokuto/images/c/c6/Mus%C5%8D_Tensei_%28Kenshiro%29_manga.jpg/revision/latest/scale-to-width-down/300?cb=20111028132417", ca.getImage());
				assertEquals("male", ca.getGender());
				
				//assertEquals(new Series().getCharacters(), ca.getSkills());
				assertEquals("Hokuto Shin Ken", ca.getSpecial());
				assertEquals("Successor of Hokuto Shin Ken ", ca.getProfile());
				assertEquals(7, ca.getRank());
				
				//assertEquals(new Series(967, "In the year 19XX, after being betrayed and left for dead, bravehearted warrior Kenshirou wanders a post-apocalyptic wasteland on a quest to track down his rival, Shin, who has kidnapped his beloved fiancée Yuria. During his journey, Kenshirou makes use of his deadly fighting form, Hokuto Shinken, to defend the helpless from bloodthirsty ravagers. It isn't long before his exploits begin to attract the attention of greater enemies, like warlords and rival martial artists, and Keshirou finds himself involved with more than he originally bargained for. Faced with ever-increasing odds, the successor of Hokuto Shinken is forced to put his skills to the test in an effort to take back what he cares for most. And as these new challenges present themselves and the battle against injustice intensifies, namely his conflict with Shin and the rest of the Nanto Seiken school of martial arts, Kenshirou is gradually transformed into the savior of an irradiated and violent world. [Written by MAL Rewrite]", "https://cdn.myanimelist.net/images/anime/8/18502.jpg", "Fist of the North Star", new Series().getCharacters()), ca.getSeries());
			}
		}
	}

}
