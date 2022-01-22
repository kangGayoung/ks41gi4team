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
	private SettlementService settlementService;
	 public SettlementController(SettlementService settlementService){
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
	  
	  
	  // 조회 버튼 - 결과 페이지 연결
	  //매입원장 조회 결과 페이지 
	  @GetMapping("/purchaseList")
	  public String purchaseList() {
		  return	"settlement/settlementResult/purchaseList";
	  }
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
	@GetMapping("/purchaseLook")
	public String purchaseLookup(Model model) {
		model.addAttribute("title", "매입원장내역조회");
		return "settlement/purchaseLookup";
	
	}
	@PostMapping("/purchaseLook")
	@ResponseBody
	public List<Map<String,Object>> purchaseLookup(){
		
		List<Map<String,Object>> SelectPurchaseList= settlementService.SelectPurchaseList();
		return SelectPurchaseList;
	}
	
	
	
	//매출원장 1차 페이지
	@GetMapping("/salesLook")
	public String salesLookup(){
		
		return "settlement/salesLookup";
	}
	//거래집계 1차 페이지 
	@GetMapping("/orderInvoice")
	public String orderInvoice(){
		
		return "settlement/orderInvoice";
	}
	
	
	

	
}
