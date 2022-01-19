
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
	@RequestMapping ("/taxBillInsert")//(value="/taxBillInsert2", method = RequestMethod.GET)
	public ModelAndView  popupGet() throws Exception{
		ModelAndView  bi = new ModelAndView();
			bi.setViewName("taxBillInsert");
			//System.out.println("yyyyyyyyyyyyyyeannie_bill_popup1");
			return bi;
	}
	
//결과 페이지 화면 연결 /bill/billResult
	/*
	 * @GetMapping("/taxBillInsert2")
	 *  public String billInsert2() { 
	 *  return "bill/billResult/taxBillInsert2";
	 *   }
	 */
	
//거래명세서 출력버튼 - 화면
	@GetMapping("/purchaseInvoicePrint")
	public String purchaseInvoicePrint() {
		return	"bill/billResult/purchaseInvoicePrint";
	}
	
	//거래명세서 결과 페이지 
	@GetMapping("/purchaseInvoiceList")
	public String purchaseInvoiceList() {
		return	"bill/billResult/purchaseInvoiceList";
	}
	
//정산서 결과 페이지	
	@GetMapping("/accountsList")
		public String accountsList() {
			return	"bill/billResult/accountsList";
		}
	
//세금계산서 결과페이지 
	@GetMapping("/taxBillList")
	public String taxBillList() {
		return	"bill/billResult/taxBillList";
	}
	//세금계산서 입력 버튼 - 화면 
	@GetMapping("/billInsert")
	public String billInsert() {
		return	"bill/billResult/billInsert";
	}
	//세금계산서 입력 팝업 버튼 - 화면
	@GetMapping("/taxBillInsert")
		public String taxBillInsert() {
			return	"bill/billResult/taxBillInsert";
		}
	
	
	
	//1차 화면 연결
	//거래명세서 화면 
	@GetMapping("/purchaseInvoice")
		public String purchaseInvoice() {
			return "bill/purchaseInvoice";
		}

	//정산서 화면
	@GetMapping("/accounts")
		public String accounts() {
			return "bill/accounts";
		}
	
//세금계산서화면
	@GetMapping("/taxBill")
		public String taxBill() {
			return "bill/taxBill";
		}

}
