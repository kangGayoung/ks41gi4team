package kr.or.test.spring_test.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@GetMapping("/orderMG")
	public String orderMG(Model model) {
		
		List<OrderList> orderList = orderService.orderListPrint();
		model.addAttribute("title", "주문관리");
		model.addAttribute("orderList", orderList);
		return "goods/order/orderMG/orderMG";
	}
	/*
	 * @PostMapping("/orderMG")
	 * 
	 * @ResponseBody public List<Map<String, Object>> getorderList () {
	 * List<Map<String, Object>> orderList = orderService.getorderList(); //전체 데이터
	 * 가져오기 return orderList; }
	 */
	
	@GetMapping("/preOrder")
	public String preOrder() {
		return "goods/order/preOrder/preOrder";
	}
	
	@GetMapping("/returnList")
	public String returnList() {
		return "goods/order/returnList/returnList";
	}
	
	
}
