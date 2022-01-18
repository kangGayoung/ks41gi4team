package kr.or.test.spring_test.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import groovyjarjarpicocli.CommandLine.Model;
import kr.or.test.spring_test.dto.StaffInfo;
import kr.or.test.spring_test.service.MainService;

@Controller
public class LoginController {

	private MainService mainService;
	
	public LoginController(MainService mainService) {
		this.mainService = mainService;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		
		return "contents/login/login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam(value="staffId",required=false)String staffId
						,@RequestParam(value="staffPw",required=false)String staffPw
						,HttpSession session) {
		if(		staffId != null && !"".equals(staffId)
			&&	staffPw != null && !"".equals(staffPw)) {
			
			StaffInfo staff = mainService.getStaffIdCheck(staffId);
			
			if(	staff != null && staff.getStaffPw() != null
					&&	staffPw.equals(staff.getStaffPw())  ) {
				session.setAttribute("SID", staffId);
				session.setAttribute("SNAME", staff.getStaffName());
				session.setAttribute("SLEVEL", staff.getStaffLevel());
				
				return "redirect:/";
			}
		}
		return "redirect:/login";
	}
	
}
