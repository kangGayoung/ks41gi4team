package kr.or.test.spring_test.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SettlementManagement{
	
	@GetMapping("/purchaseLookup")
	public String purchaseLookup() {

		return "yh/settlementManagement/purchaseLookup";
	}
	
	@GetMapping("/salesLookup")
	public String salesLookup(){
		
		return "yh/settlementManagement/salesLookup";
	}
	
	@GetMapping("/taxBill")
	public String taxBill() {
		
		return "yh/bill/taxBfffffill";
	}
	
	@GetMapping("/accounts")
	public String accounts() {
		
		return "yh/bill/accounts";
	}
	
	@GetMapping("/purchaseInvoice")
	public String purchaseInvoice() {
		
		return "yh/bill/purchaseInvoice";
		
	}
	

}
