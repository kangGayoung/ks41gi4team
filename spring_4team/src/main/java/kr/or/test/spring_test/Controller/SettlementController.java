package kr.or.test.spring_test.Controller;



import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.test.spring_test.service.SettlementService;


@Controller
@RequestMapping ("/settlement")
public class SettlementController{

	//의존성 주입
	private final SettlementService settlementService;
	public SettlementController(SettlementService settlementService){
			this.settlementService = settlementService;
				
			}
		
	 
	
	  // 조회 버튼 - 결과 페이지 연결
	
	
	
	
	  //매출원장 조회 결과 페이지 
	@GetMapping("/salesLookupList")
	public String salesLookupList() {
		return	"settlement/settlementResult/salesLookupList";
	}
	//거래집계 조회 결과 페이지 
	@GetMapping("/orderInvoiceList")
	public String orderInvoiceList() {
		return	"settlement/settlementResult/orderInvoiceList";
	}
	
	
	//1차 메뉴 페이지 연결
	//매입원장 1차 페이지  -  조회 버튼 내역 조회 
	@GetMapping("/purchase")
	public String purchase(Model model) {
		model.addAttribute("title", "매입원장내역조회");
		return "settlement/purchaseLookup";
	
	}
	@PostMapping("/purchase")
	@ResponseBody
	public List<Map<String,Object>> purchase(){
		
		List<Map<String,Object>> selectPurchaseList= settlementService.selectPurchaseList();
		return selectPurchaseList;
	}
	
	
	
	//매출원장 1차 페이지
	@GetMapping("/sales")
	public String sales(){
		
		return "settlement/salesLookup";
	}
	//거래집계 1차 페이지 
	@GetMapping("/order")
	public String order(){
		
		return "settlement/orderInvoice";
	}
	
	
	

	
}
