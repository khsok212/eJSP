package kr.or.ddit.lprod.repository;

import java.util.List;
import java.util.Map;

import kr.or.ddit.lprod.model.LprodVo;

public interface ILprodDao {

	public List<LprodVo> getLprodList();
	
	public List<Map> getProdList(String prod_lgu);
}
