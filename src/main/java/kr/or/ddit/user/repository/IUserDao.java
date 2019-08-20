package kr.or.ddit.user.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.model.User;

public interface IUserDao {
	
	List<User> getUserList(SqlSession sqlSession);

	User getUser(SqlSession sqlSession, String userId);
	
	List<User> getUserListOnlyHalf(SqlSession sqlSession);
}
