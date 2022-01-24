
package kr.or.test.spring_test.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.test.spring_test.service.BillService;




@Controller
@RequestMapping("/bill")
public class BillController{
		
	@Autowired
		private BillService billService;

	public BillController(BillService billService) {
		this.billService = billService;
	}
	
	
	
	
	
	


//거래명세서 프린트버튼 - 화면
	@GetMapping("/invoicePrints")
	public String invoicePrints() {
		return	"bill/billResult/invoicePrints";
	}
	
	//거래명세서 결과 페이지 
	@GetMapping("/invoicesList")
	public String invoicesList() {
		return	"bill/billResult/invoicesList";
	}
	
//정산서 프린트 페이지	
	@GetMapping("/accountsPrint")
	public String accountsPrint() {
		return	"bill/billResult/accountsPrint";
	}
//정산서 결과 페이지	
	@GetMapping("/accountsList")
		public String accountsList() {
			return	"bill/billResult/accountsList";
		}
	
	
	
	
	
	
//세금계산서 결과페이지  - 데이터 테이블
	@GetMapping("/billList")
	public String billList(Model model) {
		model.addAttribute("title", "세금명세서조회");
		
		return	"bill/taxBillList";
	}
	@PostMapping("/billList")
	@ResponseBody
	public List<Map<String,Object>> billList(){
		
		List<Map<String,Object>> taxBillList = billService.taxBillList();
		return taxBillList;
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
	@GetMapping("/invoice")
		public String invoice() {
			return "bill/invoiceLookup";
		}

	//정산서 화면
	@GetMapping("/accounts")
		public String accounts() {
			return "bill/accountsLookup";
		}
	
//세금계산서화면
	@GetMapping("/taxBill")
		public String taxBill() {
			return "bill/taxBillLookup";
		}

}
