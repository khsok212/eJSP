package kr.or.ddit.user.repository;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.user.model.UserVo;

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
		List<UserVo> userList = new ArrayList<UserVo>();
		userList.add(new UserVo("집에"));
		userList.add(new UserVo("가고"));
		userList.add(new UserVo("싶다"));
		userList.add(new UserVo("빨리"));
		userList.add(new UserVo("가자"));
		
		return userList;
	}
}
