package kr.or.test.spring_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@GetMapping("/dailyOrder")
	public String dailyOrder() {
		return "contents/order/dailyOrder/dailyOrder";
	}
	@GetMapping("/deliMG")
	public String deliMG() {
		return "contents/order/deliMG/deliMG";
	}
	@GetMapping("/orderByStore")
	public String orderByStore() {
		return "contents/order/orderByStore/orderByStore";
	}
	@GetMapping("/orderMG")
	public String orderMG() {
		return "contents/order/orderMG/orderMG";
	}
	@GetMapping("/preOrder")
	public String preOrder() {
		return "contents/order/preOrder/preOrder";
	}
	
	
}
