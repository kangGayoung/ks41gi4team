package kr.or.test.spring_test.Controller;



import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import kr.or.test.spring_test.dto.StaffInfo;
import kr.or.test.spring_test.service.BusinessService;
import kr.or.test.spring_test.service.MainService;

@Controller
@RequestMapping("/basic")
public class BasicController {
	
	private static final Logger log = LoggerFactory.getLogger(BasicController.class);

	
	private final MainService mainService;
	private final BusinessService businessService;
	//의존성 주입
	public BasicController(BusinessService businessService,MainService mainService) {
		this.businessService = businessService;
		this.mainService = mainService;
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
	
	//사원 수정
	@GetMapping("/staffUpdate")
	public String staffUpdate(StaffInfo staff) {
		
		log.info("수정요청 입력받은 회원아이디 {}",staff);
		mainService.staffUpdate(staff);
		
		return "redirect://contents/basicMG/staffInsert/staffUpdate";
	}
	@GetMapping("/staffDelete")
	public String staffDelete() {
		return "contents/basicMG/staffInsert/staffDelete";
	}
	
	
	
	
	@GetMapping("/staffList")
	public String staffList(@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage,
			Model model) {
		
		
		Map<String, Object> resultMap = mainService.staffInfoPrint(currentPage);
		
		model.addAttribute("title","사원목록");
		model.addAttribute("currentPage",currentPage);
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("staffList", resultMap.get("staffList"));
		model.addAttribute("endPageNum", resultMap.get("endPageNum"));
		model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		
		
		model.addAttribute("title","사원목록");
		
		return "contents/basicMG/staffList/staffList";
	}
	
	@PostMapping("/staffList")
	public String staffListSearch(@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage,
			String searchKey, String searchValue, Model model) {
		
		
		Map<String, Object> resultMap = mainService.staffInfoPrint(searchKey,searchValue,currentPage);
		
		
		model.addAttribute("title","사원 검색목록");
		model.addAttribute("currentPage",currentPage);
		
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("staffList", resultMap.get("staffList"));
		model.addAttribute("endPageNum", resultMap.get("endPageNum"));
		model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		
	
		return "contents/basicMG/staffList/staffListSearch";
	}
	
	
	//post로
	@GetMapping("/businessInsert")
	public String businessInsert() {
		return "contents/basicMG/businessInsert/businessInsert";
	}
	
	@GetMapping("/businessInfo")
	public String businessInfo(@RequestParam(value="currentPage",required = false, defaultValue="1")int currentPage
			,Model model) {
		
		  Map<String, Object> resultMap = businessService.BusinessListPrint(currentPage);
		  
		  model.addAttribute("title","거래처 조회");
		  model.addAttribute("currentPage",currentPage); 
		  model.addAttribute("lastPage", resultMap.get("lastPage")); 
		  model.addAttribute("businessList",resultMap.get("businessList")); 
		  model.addAttribute("endPageNum",resultMap.get("endPageNum")); 
		  model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		 
		return "contents/basicMG/businessInfo/businessInfo";
	}
	
	
	
	@GetMapping("/storageInfo")
	public String storageInfo() {
		return "contents/basicMG/storageInfo/storageInfo";
	}
	

	
	
}
