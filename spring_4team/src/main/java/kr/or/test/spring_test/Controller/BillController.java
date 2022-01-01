
package kr.or.test.spring_test.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bill")

public class BillController{
	
	@GetMapping("/taxBill")
	public String taxBill() {
		
		return "bill/taxBill";
	}
	
	@GetMapping("/accounts")
	public String accounts() {
		
		return "bill/accounts";
	}
	
	@GetMapping("/purchaseInvoice")
	public String purchaseInvoice() {
		
		return "bill/purchaseInvoice";
		
	}
	

}
