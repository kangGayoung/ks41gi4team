package kr.or.test.spring_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/settlement")
public class SettlementController{
	
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
