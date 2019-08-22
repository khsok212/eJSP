package kr.or.ddit.lprod.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.user.model.User;
import kr.or.ddit.user.repository.IUserDao;
import kr.or.ddit.user.repository.UserDao;
import kr.or.ddit.user.repository.UserDaoTest;
import kr.or.ddit.util.MybatisUtil;

public class LprodDaoTest {
	private static final Logger logger = LoggerFactory.getLogger(LprodDaoTest.class);
	private ILprodDao lprodDao;
	private SqlSession sqlSession;
	/**
	 * 
	* Method : getAllListTest
	* 작성자 : PC-08
	* 변경이력 :
	* Method 설명 : getAllList 테스트
	 */
	
	@Before
	   public void setup() {
	      logger.debug("before");
	      lprodDao = new LprodDaoImpl();
	      sqlSession = MybatisUtil.getSession();
	   }
	   
	   // 테스트에 공통적으로 사용한 자원을 해제
	   @After
	   public void tearDown() {
	      logger.debug("after");
	      sqlSession.close();
	   }
	
	@Test
	public void getAllListTest() {
		/***Given***/
		ILprodDao lprodDao = new LprodDaoImpl();

		/***When***/
		List<LprodVo> lprodList = lprodDao.getLprodList();

		/***Then***/
		assertEquals(10, lprodList.size());
	}
	
	/**
	 * 
	* Method : getProdListTest
	* 작성자 : PC-08
	* 변경이력 :
	* Method 설명 : getProdList 테스트
	 */
	@Test
	public void getProdListTest() {
		/***Given***/
		String prod_lgu = "P101";
		ILprodDao lprodDao = new LprodDaoImpl();

		/***When***/
		List<Map> prodList = lprodDao.getProdList(prod_lgu);

		/***Then***/
		assertEquals(6, prodList.size());
	}

	/**
	* 
	* Method : getUserPagingList
	* 작성자 : 202-01
	* 변경이력 :
	* Method 설명 : 사용자 페이징 리스트 조회 테스트
	 */
	@Test
	public void getLprodPagingListTest() {
		/***Given***/
		Page page = new Page();
		page.setPage(1);
		page.setPagesize(5);
		
		/***When***/
		List<LprodVo> lprodList = lprodDao.getProdPagingList(sqlSession, page);
		/***Then***/
		assertEquals(5, lprodList.size());
		assertEquals("P101", lprodList.get(0).getLprod_gu());
	}
	
	@Test
	public void getUserTotalCnt() {
		/***Given***/
		

		/***When***/
		int totalCnt = lprodDao.getLprodTotalCnt(sqlSession);
		
		/***Then***/
		assertEquals(10, totalCnt);
	}
	
	
	
}
