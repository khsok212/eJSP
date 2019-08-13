package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.util.MybatisUtil;

public class LprodDaoImpl implements ILprodDao {

	@Override
	public List<LprodVo> getLprodList() {
		
		SqlSession sqlSession = MybatisUtil.getSession();
		List<LprodVo> lprodList = sqlSession.selectList("lprod.getLprodList");
		// 닫아야한다. 요청 계속 보내면 응답이 없다. ★★★★★ 빼먹지말자
		sqlSession.close();
		
		return lprodList;
	}

}
