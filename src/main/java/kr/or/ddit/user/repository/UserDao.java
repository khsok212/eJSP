package kr.or.ddit.user.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.MybatisUtil;

public class UserDao implements IUserDao{

	
	/**
	* Method : getUserList
	* 작성자 : 202-01
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 전체 리스트 조회
	*/
	@Override
	public List<UserVo> getUserList() {
		//db에서 조회가 되었다고 가정하고 가짜 객체를 리턴
//		List<UserVo> userList = new ArrayList<UserVo>();
//		userList.add(new UserVo("강해신"));
//		userList.add(new UserVo("박진하"));
//		userList.add(new UserVo("윤경주"));
//		userList.add(new UserVo("김도훈"));
//		userList.add(new UserVo("홍다은"));
		
		// db에서 가져오기  ★
		SqlSession sqlSession = MybatisUtil.getSession();
		List<UserVo> userList = sqlSession.selectList("user.getUserList");
		// 닫아야한다. 요청 계속 보내면 응답이 없다. ★★★★★ 빼먹지말자
		sqlSession.close();
		
		return userList;
	}

	@Override
	public UserVo getUser(String userId) {
		SqlSession sqlSession = MybatisUtil.getSession();
		UserVo userVo = sqlSession.selectOne("user.getUser", userId);
		sqlSession.close();
		
		return userVo;
	}
}
