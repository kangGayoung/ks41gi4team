package kr.or.test.spring_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	
	@GetMapping("/orderMG")
	public String orderMG() {
		return "order/orderMG/orderMG";
	}
	
	@GetMapping("/preOrder")
	public String preOrder() {
		return "order/preOrder/preOrder";
	}
	
	@GetMapping("/returnList")
	public String returnList() {
		return "order/returnList/returnList";
	}
	
	
}
