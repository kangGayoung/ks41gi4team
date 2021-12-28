package kr.or.test.spring_test.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class settlementsManagement {
	
	@GetMapping("/settlementsManagement")
	public String getMemberList() {

		return "yh/settlementsManagement/settlementsLookup";
	}
	

}
