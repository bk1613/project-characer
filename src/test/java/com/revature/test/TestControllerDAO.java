package com.revature.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.revature.controllers.AnimeController;
import com.revature.repository.AnimeCharacterDAO;
import com.revature.repository.AnimeSeriesDAO;
import com.revature.repository.CharacterSkillDAO;

public class TestControllerDAO {
	private AnimeController ac = null;
	private AnimeCharacterDAO cdao = null;
	private AnimeSeriesDAO sdao = null;
	private CharacterSkillDAO skdao = null;
	

	@Before
	public void setUp() throws Exception {
		cdao = new AnimeCharacterDAO();
		sdao = new AnimeSeriesDAO();
		skdao = new CharacterSkillDAO();
		ac = new AnimeController(cdao, sdao, skdao);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
