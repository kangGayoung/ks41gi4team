package kr.or.test.spring_test.Controller;



import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.test.spring_test.dto.BusinessInfo;
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
	
	
	//사원가입처리화면
	@GetMapping("/staffInsert")
	public String staffInsert() {
		
		return "contents/basicMG/staffInsert/staffInsert";
	}
	
	@PostMapping("/staffInsert")
	public String staffInsertSubmit(StaffInfo staffInfo) {
		
		System.out.println("사원가입 입력받은 값:" + staffInfo);
		
		String staffId = staffInfo.getStaffId();
		
		if(staffId != null && !"".equals(staffId) ) {
			

			staffInfo.setMainBusinessCode("mart001");
			staffInfo.setStaffState(null);
			staffInfo.setStaffLevel("사원");
			staffInfo.setSystemLevel("3");
			staffInfo.setAuthoriser("m_admin001");
			System.out.println("세팅후 입력값 "+ staffInfo);
			
			mainService.staffInsert(staffInfo);
		}
		
		return "redirect:/basic/staffList";
	}
	
	
	
	
	//사원 수정
	@GetMapping("/staffUpdate")
	public String staffUpdate(@RequestParam(value = "staffId",required = false)String staffId
			,Model model) {
		
		log.info("수정요청 입력받은 회원아이디 {}",staffId);
		
		if(staffId !=null && !"".equals(staffId)) {
			StaffInfo staffInfo = mainService.getStaffIdCheck(staffId);
			model.addAttribute("staffInfo",staffInfo);
		}else {
			
			return "redirect:/contents/basicMG/staffList/staffList";
		}
		
		return "/contents/basicMG/staffInsert/staffUpdate";
	}
	
	@PostMapping("/staffUpdate")
	public String staffUpdate(StaffInfo staff) {
		log.info("사원 수정화면 입력값 {}",staff);
		
		
		
		mainService.staffUpdate(staff);
		
		return "redirect:/basic/staffList";
	}
	
	
	@GetMapping("/staffDelete")
	public String staffDelete() {
		return "contents/basicMG/staffInsert/staffDelete";
	}
	
	
	
	
	@GetMapping("/staffList")
	public String staffList(@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage,
			HttpSession session,
			Model model) {
	
		
		session.setAttribute("SKEY", null);
		session.setAttribute("SVAL", null);
		
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
			String searchKey, String searchValue, Model model, HttpSession session) {
		
		
		Map<String, Object> resultMap = mainService.staffInfoPrint(searchKey,searchValue,currentPage);
	
			
		session.setAttribute("SVAL", searchValue);
	
		model.addAttribute("title","사원 검색목록");
		model.addAttribute("currentPage",currentPage);
		
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("staffList", resultMap.get("staffList"));
		model.addAttribute("endPageNum", resultMap.get("endPageNum"));
		model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		
	
		return "contents/basicMG/staffList/staffList";
	}
	
	//거래처 등록화면	
	@GetMapping("/businessInsert")
	public String businessInsert() {
		return "contents/basicMG/businessInsert/businessInsert";
	}
	
	//거래처 등록
	@PostMapping("/businessInsert")
	public String businessInsertSubmit(BusinessInfo businessInfo, HttpSession session) {
		
		
		System.out.println("거래처등록 입력받은 값:" + businessInfo);
		
		String Bname = businessInfo.getBusinessName();
		
		if(Bname != null && !"".equals(Bname) ) {
			
			//거래처 코드 생성은 서비스에서 나머지 기타정보 입력
			businessInfo.setMainBusinessCode("mart001");
			businessInfo.setBusinessEmail(null);
			businessInfo.setBusinessMainAccount("농협");
			businessInfo.setBusinessAccountNumber("123-456-789");
			businessInfo.setBusinessAccountHolder(businessInfo.getBusinessPartnerName());
			businessInfo.setStaffId((String) session.getAttribute("SID"));
			
			businessService.BusinessInsert(businessInfo);
			
		}
		
		return "redirect:/basic/businessInfo";
	}
	
	
	
	@GetMapping("/businessInfo")
	public String businessInfo(Model model) {
		
		model.addAttribute("title", "거래처 목록조회");
		return "contents/basicMG/businessInfo/businessInfo";
	}
	
	@PostMapping("/businessInfo")
	@ResponseBody
	public List<Map<String,Object>> businessInfo(){
		
		List<Map<String,Object>> businessList = businessService.BusinessList();
		
		return businessList;
	}
	
	
	
	
	
	
	@GetMapping("/storageInfo")
	public String storageInfo() {
		return "contents/basicMG/storageInfo/storageInfo";
	}
	

	
	
}
