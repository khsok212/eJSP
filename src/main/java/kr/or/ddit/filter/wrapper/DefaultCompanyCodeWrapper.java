package kr.or.ddit.filter.wrapper;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class DefaultCompanyCodeWrapper extends HttpServletRequestWrapper{

	private Map<String, String[]> reqMap;
	
	public DefaultCompanyCodeWrapper(HttpServletRequest request) {
		super(request);
		
		reqMap = new HashMap<String, String[]>(request.getParameterMap());
		String unt_cd = request.getParameter("unt_cd");
		
		// unt_cd 파라미터가 null이거나 ""이면 기본값 DDIT로 파라미터 값이 설정되게끔 수정
		if(unt_cd == null || unt_cd.equals("")) {
			unt_cd = "DDIT";
		}
//		unt_cd = unt_cd == null ? "DDIT" : unt_cd;
		
		reqMap.put("unt_cd", new String[] {unt_cd});
	}
	
	// parameter 관련된 메소드를 재정의
	
	// String getParameter(String parameter)
	// String[] getParameterValues(String parameter)
	// Enumeration<String> getParameterNames()
	// Map<String, String[]> getPrameterMap()
	
	// LoginController(servlet)에서 request Map 사용해서 값 넣어주면 에러(error)발생 -> 이유: 수정이 불가능하다
	
	@Override
	public String getParameter(String name) {
		String[] values = reqMap.get(name);
		if(values == null) {
			return null;
		}else {
			return values.length > 0 ? values[0] : null;
		}
	}
	
	@Override
	public String[] getParameterValues(String name) {
		return reqMap.get(name);
	}
	
	@Override
	public Enumeration<String> getParameterNames() {
		return Collections.enumeration(reqMap.keySet());
	}
	
	@Override
	public Map<String, String[]> getParameterMap() {
		return reqMap;
	}
	
}
