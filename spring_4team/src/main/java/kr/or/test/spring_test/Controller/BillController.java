
package kr.or.test.spring_test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/bill")
public class BillController{
	
	/*
	 * private BillService bilService;
	 * 
	 * @Autowired public BillController(BillService billService) {
	 * this.bilService=billService; }
	 */



	
	/*
	 * @RequestMapping("/billModal") public String billModalBtn() { billModalBtn bmb
	 * = new billModalBtn() ; bmb.setViewName("billModal"); return bmb; }
	 */
	 
	@GetMapping("/billReg")
	public String billReg() {
		return "bill/billResult/billReg";
	}
	
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
