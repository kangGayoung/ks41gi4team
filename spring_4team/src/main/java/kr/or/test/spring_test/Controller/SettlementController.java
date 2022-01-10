package kr.or.test.spring_test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.test.spring_test.dto.PurchaseLookupList;
import kr.or.test.spring_test.service.OrderService;
import kr.or.test.spring_test.service.SettlementService;


@Controller
@RequestMapping("/settlement")
public class SettlementController{
	
	//의존성 주입
	/*
	 * @Autowired public SettlementController(SettlementService settlementService) {
	 * this.settlementService = settlementService;
	 * 
	 * }
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
