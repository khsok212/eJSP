package kr.or.ddit.lprod.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.lprod.model.LprodVo;

public class LprodDaoTest {

	@Test
	public void getLprodListTest() {
		/***Given - 상황 ***/
		ILprodDao lprodDao = new LprodDaoImpl();

		/***When - 메서드 쿼리 ***/
		List<LprodVo> lprodList = lprodDao.getLprodList();
		
		/***Then - 기술 ***/
		assertEquals(10, lprodList.size());
	}

}
