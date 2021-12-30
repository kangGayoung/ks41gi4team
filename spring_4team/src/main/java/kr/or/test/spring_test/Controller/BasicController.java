package kr.or.test.spring_test.Controller;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.test.spring_test.dto.StaffInfo;
import kr.or.test.spring_test.service.MainService;

@Controller
@RequestMapping("/basic")
public class BasicController {
	
	private MainService mainService;
	
	//의존성 주입
	public BasicController(MainService mainService) {
		this.mainService= mainService;
	}

	//중복체크
	@PostMapping("/staffIdCheck")
	@ResponseBody
	public boolean staffIdCheck(@RequestParam(value="staffId", required = false)String staffId) {
		
		boolean result = false;
		
		int check = mainService.getStaffCheck(staffId);
		if(check > 0) result= true;
		
		return result;
		
	}
	
	
	@GetMapping("/staffInsert")
	public String staffInsert() {
		return "contents/basicMG/staffInsert/staffInsert";
	}
	
	
	@GetMapping("/staffList")
	public String staffList(Model model) {
		
		
		 List<StaffInfo> staffList = mainService.staffInfoPrint();
		  
		 model.addAttribute("title","사원목록"); 
		 model.addAttribute("staffList",staffList);
		 
		return "contents/basicMG/staffList/staffList";
	}
	
	@GetMapping("/staffPay")
	public String staffPay() {
		return "contents/basicMG/staffPay/staffPay";
	}
	
	@GetMapping("/businessInsert")
	public String businessInsert() {
		return "contents/basicMG/businessInsert/businessInsert";
	}
	
	@GetMapping("/businessInfo")
	public String businessInfo() {
		return "contents/basicMG/businessInfo/businessInfo";
	}
	
	
	@GetMapping("/storageInfo")
	public String storageInfo() {
		return "contents/basicMG/storageInfo/storageInfo";
	}
	@GetMapping("/storageInsert")
	public String storageInsert() {
		return "contents/basicMG/storageInfo/storageInsert";
	}
	
	@GetMapping("/displayInfo")
	public String displayInfo() {
		return "contents/basicMG/displayInfo/displayInfo";
	}

	
	
}
