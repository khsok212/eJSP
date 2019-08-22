package kr.or.ddit.lprod.service;



import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVo;


public class LprodServiceTest {

	 private ILprodService lprodService;
	   
	   @Before
	   public void setup() {
		   lprodService = new LprodServiceImpl();
			
	   }
	   
	 @Test
	 public void getLprodPagingListTest() {
		 /***Given***/
		  Page page = new Page();
	      page.setPage(1);
	      page.setPagesize(5);

	      /***When***/
	      Map<String, Object> resultMap = lprodService.getLprodPagingList(page);
	      List<LprodVo> lprodList = (List<LprodVo>) resultMap.get("lprodList");
	      int paginationSize = (Integer)resultMap.get("paginationSize");
	      
	      /***Then***/
	      assertEquals(5, lprodList.size());
	      assertEquals("P101", lprodList.get(0).getLprod_gu());
	      assertEquals(2, paginationSize);
	      
	      
	 }
}
