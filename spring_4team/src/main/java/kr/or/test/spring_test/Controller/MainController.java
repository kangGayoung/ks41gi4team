package kr.or.test.spring_test.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.test.spring_test.dto.StaffInfo;
import kr.or.test.spring_test.service.MainService;


@Controller
public class MainController {
	
	MainService mainService;
	
	public MainController(MainService mainService) {
		this.mainService = mainService;
	}
	

	@GetMapping("/")
	public String main(HttpSession session) {
		
		
		if(session.getAttribute("SID")==null) {
			StaffInfo staff = mainService.getStaffIdCheck("m_admin001");
			session.setAttribute("SID", "m_admin001");
			session.setAttribute("SNAME", staff.getStaffName());
			
		}
					
		return "main";
	}
	
}


