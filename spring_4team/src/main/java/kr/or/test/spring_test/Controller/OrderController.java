package kr.or.test.spring_test.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.test.spring_test.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	private OrderService orderService;

	// 의존성 주입
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	// 신규발주등록 버튼 모달
	@GetMapping("/modal")
	public String modal(Model model) {
		model.addAttribute("title", "modal");
		return "goods/order/orderMG/modal";
	}

	// 발주관리 데이터 테이블 검색화면
	@PostMapping("/orderMG")
	public String orderMG(@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
			@RequestParam(value = "orderSearch01", required = false) String orderSearch01,
			@RequestParam(value = "orderSearchVal", required = false) String orderSearchVal, Model model) {

		Map<String, Object> resultMap = orderService.getOrderListBySearch01(currentPage, orderSearch01, orderSearchVal);

		model.addAttribute("currentPage", currentPage);
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("orderList", resultMap.get("orderList"));
		model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		model.addAttribute("endPageNum", resultMap.get("endPageNum"));

		return "goods/order/orderMG/orderMG";
	}
	
	// 발주관리 페이징
	@GetMapping("/orderMG")
	public String orderMG(@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
			Model model) {

		Map<String, Object> resultMap = orderService.getOrderList(currentPage);

		model.addAttribute("currentPage", currentPage);
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("orderList", resultMap.get("orderList"));
		model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		model.addAttribute("endPageNum", resultMap.get("endPageNum"));

		return "goods/order/orderMG/orderMG";
	}
	/*
	// 신규발주 등록
	@PostMapping("/orderMG")
	public String orderMG(OrderList orderReg) {
		
		System.out.println("OrderController 발주등록 화면에서 입력받은 값: " + orderReg);
		//insert 처리
		//null 체크 
		
		
		return "redirect:/order/orderMG";
	}
	
	 * @GetMapping("/orderMG") public String addMember(Model model) {
	 * System.out.println("/orderMG GET방식 요청"); model.addAttribute("title",
	 * "신규발주등록"); //DB 레벨 등급 LIST List<MemberLevel> memberLevelList =
	 * OrderService.orderReg(null); model.addAttribute("memberLevelList",
	 * memberLevelList); return "member/addMember"; }
	 
	/*
	 * @PostMapping("/preOrder") public String preOrder(
	 * 
	 * @RequestParam(value="currentPage", required = false, defaultValue = "1") int
	 * currentPage,
	 * 
	 * @RequestParam(value="preOrderSearch", required = false) String
	 * preOrderSearch,
	 * 
	 * @RequestParam(value="preOrderSearchVal", required = false) String
	 * preOrderSearchVal, Model model) {
	 * 
	 * Map<String, Object> resultMap = orderService.getPreOrderSearch(currentPage,
	 * preOrderSearch, preOrderSearchVal );
	 * 
	 * model.addAttribute("currentPage", currentPage);
	 * model.addAttribute("lastPage", resultMap.get("lastPage"));
	 * model.addAttribute("orderList", resultMap.get("orderList"));
	 * model.addAttribute("startPageNum", resultMap.get("startPageNum"));
	 * model.addAttribute("endPageNum", resultMap.get("endPageNum"));
	 * 
	 * return "goods/order/preOrder/preOrder"; }
	 */

	// 납품예정전체 조회
	@GetMapping("/preOrder")
	public String preOrder(@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
			Model model) {

		Map<String, Object> resultMap = orderService.getPreOrderList(currentPage);

		model.addAttribute("currentPage", currentPage);
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("orderList", resultMap.get("orderList"));
		model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		model.addAttribute("endPageNum", resultMap.get("endPageNum"));

		return "goods/order/preOrder/preOrder";
	}

	// 납품 예정리스트 조회 및 검색 ajax
	@PostMapping("/preOrder")
	@ResponseBody
	public List<Map<String, Object>> preOrder() {
		List<Map<String, Object>> preOrderList = orderService.getPreOrderList();
		return preOrderList;
	}

	@GetMapping("/returnList")
	public String returnList() {
		return "goods/order/returnList/returnList";
	}

}
