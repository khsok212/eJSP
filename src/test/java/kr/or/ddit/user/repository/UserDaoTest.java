package kr.or.ddit.user.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class UserDaoTest {
	// 실행 > junit테스트
	
	/**
	* Method : getUserListTest
	* 작성자 : 202-01
	* 변경이력 :
	* Method 설명 : getUserList 테스트
	*/
	
	SqlSession sqlSession = MybatisUtil.getSession();
	
	@Test
	public void getUserListTest() {
		/***Given - 상황 ***/
		IUserDao userDao = new UserDao();

		/***When - 메서드 쿼리 ***/
		List<User> userList = userDao.getUserList(sqlSession);
		
		/***Then - 기술 ***/
		assertEquals(105, userList.size());
	}
	
	/**
	* Method : getUserTest
	* 작성자 : 202-01
	* 변경이력 :
	* Method 설명 : 사용자 정보 조회 테스트
	*/
	
	@Test
	public void getUserTest() {
		/***Given***/
		String userId = "brown";
		IUserDao userDao = new UserDao();

		/***When***/
		User userVo = userDao.getUser(sqlSession, userId);
		/***Then***/
		assertEquals("브라운", userVo.getUserNm());
		assertEquals("brown1234", userVo.getPass());
		
	}
	
	@Test
	public void getUserOnlyHalfTest() {
		/***Given - 상황 ***/
		IUserDao userDao = new UserDao();

		/***When - 메서드 쿼리 ***/
		List<User> userList = userDao.getUserListOnlyHalf(sqlSession);
		
		/***Then - 기술 ***/
		assertEquals(50, userList.size());
	}

}
