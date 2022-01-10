package kr.or.test.spring_test.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.or.test.spring_test.Interceptor.CommonInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	private final CommonInterceptor commonInterceptor;
	
	public WebConfig(CommonInterceptor commonInterceptor) {
		this.commonInterceptor = commonInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(commonInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/dist/**")
				.excludePathPatterns("/js/**")
				.excludePathPatterns("/pages/**")
				.excludePathPatterns("/plugins/**")
				.excludePathPatterns("/favicon.ico");
				
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}
