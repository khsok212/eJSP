package kr.or.ddit.user.service;

import java.util.List;

import kr.or.ddit.user.model.User;

public interface IUserService {
	public List<User> getUserList();
	
	public User getUser(String userId);

	public List<User> getUserListOnlyHalf();
}
