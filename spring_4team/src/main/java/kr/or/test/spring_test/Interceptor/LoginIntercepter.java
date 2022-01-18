package kr.or.test.spring_test.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginIntercepter implements HandlerInterceptor {
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		String requestUri = request.getRequestURI();
		
		String sessionId = (String) session.getAttribute("SID");
		String sessionName = (String) session.getAttribute("SNAME");
		String sessionLevel = (String) session.getAttribute("SLEVEL");
		
		if(sessionId != null) {
			response.sendRedirect("/login");
			return false;
		}else {
			requestUri = requestUri.trim();
			
		}
			
		
		
		
		return true;
	}
	
	
	
}
