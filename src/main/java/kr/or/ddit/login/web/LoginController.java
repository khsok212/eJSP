package kr.or.ddit.login.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.user.model.User;
import kr.or.ddit.user.repository.IUserDao;
import kr.or.ddit.user.repository.UserDao;

@WebServlet( urlPatterns = {"/login"}, loadOnStartup = 5 )
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// logger선언
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	/**
	 * 
	* Method : doGet
	* 작성자 : 202-01
	* 변경이력 :
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException
	* Method 설명 : 로그인 화면 요청 처리(forward)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// webapp/jsp/login.jsp  -->  /jsp/login.jsp
		
		request.getRequestDispatcher("/login/login.jsp").forward(request, response);
	}
	
	/**
	 * 
	* Method : doPost
	* 작성자 : 202-01
	* 변경이력 :
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException
	* Method 설명 : 로그인 요청 처리
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("login controller doPost()");
		// userId, password 파라미터 logger 출력
		String userId = request.getParameter("userId");
		// name속성을 가져온다 - login.jsp의 name
		String pass = request.getParameter("pass");
		
		logger.debug("userId: {}", userId);
		logger.debug("password: {}", pass);
		
		// 사용자가 입력한 계정정보와 DB에 있는 값이랑 비교
		// db에서 조회해 가져온 사용자 정보
		IUserDao userDao = new UserDao();
		User user = userDao.getUser(userId);
		
		// 사용자가 입력한 파라미터 정보와 db에서 조회해 가져온 값이 동일할 경우 --> webapp/main.jsp
		// 사용자가 입력한 파라미터 정보와 db에서 조회해 가져온 값이 다를 경우 --> webapp/login/login.jsp
		
		if(user.checkLoginValidate(userId, pass)) {
		
//		if(userId.equals(user.getUserId()) && pass.equals(user.getPass())) {
			
			HttpSession session = request.getSession();
			logger.debug("session.getId() : {}", session.getId());
			session.setAttribute("S_USERVO", user);
			
			request.getRequestDispatcher("/main.jsp").forward(request, response);
		}else {
			// forward의 경우 request, reponse 객체를 공유
			// request method도 같이 공유
			// doPost
//			request.getRequestDispatcher("/login/login.jsp").forward(request, response);
//			request.setAttribute("userId", userId);
			doGet(request, response);
		}
	}
}
