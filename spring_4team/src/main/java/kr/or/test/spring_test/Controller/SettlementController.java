package kr.or.test.spring_test.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.test.spring_test.dto.Settlement;
import kr.or.test.spring_test.service.SettlementService;


@Controller
@RequestMapping ("/settlement")
public class SettlementController{
	
//생성자 주입 방식
	  private final SettlementService settlementService;
	 public SettlementController(SettlementService settlementService) {
	  this.settlementService = settlementService; }
	 
	 
	 
	 @GetMapping("/settlementList")
	 public String getSettlementList(Model model) {
		 List<Settlement> settlementList = settlementService.getsettlementList();
		 
		 model.addAttribute("title", "매입처전체조회");
		 model.addAttribute("settlementList", settlementList);
		 
		 return "settlement/settlementResult/settlementList";
		 
		 
	 }
	 				
	
	
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
	
	
	@GetMapping("/salesLookupList")
	public String salesLookupList() {
		return	"settlement/settlementResult/salesLookupList";
	}
	@GetMapping("/orderInvoiceList")
	public String orderInvoiceList() {
		return	"settlement/settlementResult/orderInvoiceList";
	}
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
