package kr.or.test.spring_test.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/settlement")
public class SettlementController{
	
	
	/*
	 * private SettlementService settlementService;
	 * 
	 * 
	 * @Autowired public SettlementController(SettlementService settlementService) {
	 * this.settlementService = settlementService; }
	 */
	
	
	/*
	 * @GetMapping("/purchaseLookList") public String getpurchaseLookupList(Model
	 * model) { List<purchaseLookup> purchaseLookupList =
	 * SettlementService.getpurchaseLookupList();
	 * 
	 * model.addAttribute("title", "구매조회"); model.addAttribute("purchaseLookupList",
	 * purchaseLookupList); //model.addAttribute("memberList",
	 * memberService.getMemberList());
	 * 
	 * return "/settlement/settlementResult/purchaseLookList"; }
	 */
	
	
	@GetMapping("/purchaseLookList")
	public String purchaselLookList() {
		return	"settlement/settlementResult/purchaseLookList";
	}
	
	
	
	@GetMapping("/purchaseLookup")
	public String purchaseLookup() {

		return "settlement/purchaseLookup";
	}
	
	@GetMapping("/salesLookup")
	public String salesLookup(){
		
		return "settlement/salesLookup";
	}
	@GetMapping("/orderInvoice")
	public String orderInvoice(){
		
		return "settlement/orderInvoice";
	}
	
	
	

	
}
