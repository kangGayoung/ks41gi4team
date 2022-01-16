
package kr.or.test.spring_test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import kr.or.test.spring_test.service.BillService;




@Controller
@RequestMapping("/bill")
public class BillController{

	@Autowired
	private BillService billService;
	
	
	//testModal
	@GetMapping("/testModal")
	public String testModal() {
		return "bill/billResult/testModal";
	}
	
	
	//팝업띄우기
	@RequestMapping ("/taxBillInsert2")//(value="/taxBillInsert2", method = RequestMethod.GET)
	public ModelAndView  popupGet() throws Exception{
		ModelAndView  bi = new ModelAndView();
			bi.setViewName("taxBillInsert2");
			System.out.println("yyyyyyyyyyyyyyeannie_bill_popup1");
			return bi;
	}
	
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
	
	
	@GetMapping("/taxBillInsert2")
	public String billInsert2() {
		return	"bill/billResult/taxBillInsert2";
	}
	@GetMapping("/billInsert")
	public String billInsert() {
		return	"bill/billResult/billInsert";
	}
	@GetMapping("/taxBillList")
	public String taxBillList() {
		return	"bill/billResult/taxBillList";
	}
	
	
	@GetMapping("/accountsList")
	public String accountsList() {
		return	"bill/billResult/accountsList";
	}
	
	
	@GetMapping("/purchaseInvoiceList")
	public String purchaseInvoiceList() {
		return	"bill/billResult/purchaseInvoiceList";
	}
	@GetMapping("/purchaseInvoicePrint")
	public String purchaseInvoicePrint() {
		return	"bill/billResult/purchaseInvoicePrint";
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
