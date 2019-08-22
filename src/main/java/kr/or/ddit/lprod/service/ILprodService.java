package kr.or.ddit.lprod.service;

import java.util.List;
import java.util.Map;


import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVo;

public interface ILprodService {
	
	public List<LprodVo> getLprodList();
	
	public List<Map> getProdList(String prod_lgu);
	
	public Map<String, Object> getLprodPagingList(Page page);
	
}
