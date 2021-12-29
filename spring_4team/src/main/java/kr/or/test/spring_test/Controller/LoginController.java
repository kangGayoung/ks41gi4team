package kr.or.test.spring_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginPage() {
		return "contents/login/login";
	}
}
