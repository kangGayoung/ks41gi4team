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

import kr.or.test.spring_test.dto.OrderList;
import kr.or.test.spring_test.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	private OrderService orderService;
	
	//의존성 주입
	public OrderController(OrderService orderService) {
			this.orderService= orderService;
	}

	@PostMapping("/orderMG")
	public String orderMG (
							@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage,
							@RequestParam(value="orderSearch01", required = false) String orderSearch01,
							@RequestParam(value="orderSearchVal", required = false) String orderSearchVal,
							Model model) {
		
		Map<String, Object> resultMap = orderService.getOrderListBySearch01(currentPage, orderSearch01, orderSearchVal );
		
		model.addAttribute("currentPage",		currentPage);
		model.addAttribute("lastPage",			resultMap.get("lastPage"));
		model.addAttribute("orderList",			resultMap.get("orderList"));
		model.addAttribute("startPageNum",		resultMap.get("startPageNum"));
		model.addAttribute("endPageNum",		resultMap.get("endPageNum"));		
		
		return "goods/order/orderMG/orderMG";
	}
			
			
	@GetMapping("/orderMG")
	public String orderMG (@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage,
							Model model) {
		
		Map<String, Object> resultMap = orderService.getOrderList(currentPage);
		
		model.addAttribute("currentPage",		currentPage);
		model.addAttribute("lastPage",			resultMap.get("lastPage"));
		model.addAttribute("orderList",			resultMap.get("orderList"));
		model.addAttribute("startPageNum",		resultMap.get("startPageNum"));
		model.addAttribute("endPageNum",		resultMap.get("endPageNum"));
		
		return "goods/order/orderMG/orderMG";
	}
	
	@PostMapping("/preOrder")
	public String preOrder(
							@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage,
							@RequestParam(value="preOrderSearch", required = false) String preOrderSearch,
							@RequestParam(value="preOrderSearchVal", required = false) String preOrderSearchVal,
							Model model) {
		
		Map<String, Object> resultMap = orderService.getPreOrderSearch(currentPage, preOrderSearch, preOrderSearchVal );
		
		model.addAttribute("currentPage",		currentPage);
		model.addAttribute("lastPage",			resultMap.get("lastPage"));
		model.addAttribute("orderList",			resultMap.get("orderList"));
		model.addAttribute("startPageNum",		resultMap.get("startPageNum"));
		model.addAttribute("endPageNum",		resultMap.get("endPageNum"));	
			
		return "goods/order/preOrder/preOrder";
	}
	
	//납품예정전체 조회
	@GetMapping("/preOrder")
	public String preOrder(
			@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage,
			Model model) {
		
		Map<String, Object> resultMap = orderService.getPreOrderList(currentPage);
		
		model.addAttribute("currentPage",		currentPage);
		model.addAttribute("lastPage",			resultMap.get("lastPage"));
		model.addAttribute("orderList",			resultMap.get("orderList"));
		model.addAttribute("startPageNum",		resultMap.get("startPageNum"));
		model.addAttribute("endPageNum",		resultMap.get("endPageNum"));	
		
		return "goods/order/preOrder/preOrder";
	}
	
	@GetMapping("/returnList")
	public String returnList() {
		return "goods/order/returnList/returnList";
	}
	
	
}
