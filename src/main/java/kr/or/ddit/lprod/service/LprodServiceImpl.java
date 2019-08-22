package kr.or.ddit.lprod.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.repository.ILprodDao;
import kr.or.ddit.lprod.repository.LprodDaoImpl;
import kr.or.ddit.util.MybatisUtil;

public class LprodServiceImpl implements ILprodService {
	
	private ILprodDao lprodDao;
	
	public LprodServiceImpl() {
		lprodDao = new LprodDaoImpl();
	}
	
	@Override
	public List<LprodVo> getLprodList() {
		SqlSession sqlSession = MybatisUtil.getSession();
		List<LprodVo> lprodList = lprodDao.getLprodList();
		sqlSession.close();
		
		return lprodList;
	}

	@Override
	public List<Map> getProdList(String prod_lgu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getLprodPagingList(Page page) {

		Map<String, Object> map = new HashMap<String, Object>();
		
		SqlSession sqlSession = MybatisUtil.getSession();
		
		List<LprodVo> lprodList = lprodDao.getProdPagingList(sqlSession, page);
		int totalCnt = lprodDao.getLprodTotalCnt(sqlSession);
		
		map.put("lprodList", lprodList);
		map.put("paginationSize", (int)Math.ceil((double)totalCnt / page.getPagesize()));
				
		sqlSession.close();
		return map;
	}

	

}
