package kr.or.test.spring_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	
	@GetMapping("/orderMG")
	public String orderMG(Model model) {
		model.addAttribute("title", "주문관리");
		return "goods/order/orderMG/orderMG";
	}
	
	@GetMapping("/preOrder")
	public String preOrder() {
		return "goods/order/preOrder/preOrder";
	}
	
	@GetMapping("/returnList")
	public String returnList() {
		return "goods/order/returnList/returnList";
	}
	
	
}
