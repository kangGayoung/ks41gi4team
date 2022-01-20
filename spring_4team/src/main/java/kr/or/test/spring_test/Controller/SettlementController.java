package kr.or.test.spring_test.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.test.spring_test.service.SettlementService;


@Controller
@RequestMapping ("/settlement")
public class SettlementController{
	
	//의존성 : 생성자 주입 방식
	  private SettlementService settlementService;
	 
	  public SettlementController(SettlementService settlementService) {
		  this.settlementService = settlementService; 
	   }
	 
	/*
	 * //조회페이지 연결
	 * 
	 * @GetMapping("/purchaseList") // 호출할 주소 purchaseList / 매서드명
	 * selectPurchaseList() public String getselectPurchaseList(Model model) {
	 * List<SettlementDto> selectPurchaseList = SettlementService.
	 * 
	 * model.addAttribute("title", "매입거래내역조회");
	 * model.addAttribute("selectPurchaseList", selectPurchaseList);
	 * 
	 * 
	 * return "settlement/settlementResult/purchaseList"; }
	 * //settlement/settlementResult/purchaseList.html
	 */
	  
	  
	  // 조회 버튼 페이지 연결
	  //매입원장 조회 결과 페이지 
	  @GetMapping("/purchaseList")
	  public String purchaseList() {
		  return	"settlement/settlementResult/purchaseList";
	  }
	  //매입원장 조회 결과 페이지 
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
	//매입원장 1차 페이지 
	@GetMapping("/purchaseLookup")
	public String purchaseLookup() {

		return "settlement/purchaseLookup";
	}
	//매출원장 1차 페이지
	@GetMapping("/salesLookup")
	public String salesLookup(){
		
		return "settlement/salesLookup";
	}
	//거래집계 1차 페이지 
	@GetMapping("/orderInvoice")
	public String orderInvoice(){
		
		return "settlement/orderInvoice";
	}
	
	
	

	
}
