package kr.or.test.spring_test.Interceptor;

import java.util.Set;
import java.util.StringJoiner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CommonInterceptor implements HandlerInterceptor{
	
	private static final Logger log = LoggerFactory.getLogger(CommonInterceptor.class);
 

	/*
	 *  HttpServletRequest, HttpServletResponse, Object
	 *  
	 */
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Set<String> paramKeySet = request.getParameterMap().keySet();
		
		StringJoiner param = new StringJoiner(", ");
		
		for(String key : paramKeySet) {
			param.add(key+"="+request.getParameter(key));
		}
		
		log.info("Access Info =================================================================");
		log.info("PORT = {}",request.getLocalPort());
		log.info("ServerName = {}",request.getServerName());
		log.info("Method = {}", request.getMethod());
		log.info("RequestURI = {}", request.getRequestURI());
		log.info("Parameter = {}",param);
		log.info("Close ===================================");
		
		
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
		
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
