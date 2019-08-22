package kr.or.ddit.lprod.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.user.model.User;

public interface ILprodDao {

	public List<LprodVo> getLprodList();
	
	public List<Map> getProdList(String prod_lgu);
	
	List<LprodVo> getProdPagingList(SqlSession sqlSession, Page page);
	
	int getLprodTotalCnt(SqlSession sqlSession);
}
