package kr.or.test.spring_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	
	@GetMapping("/errorStock")
	public String errorStock(Model model) {
		model.addAttribute("title", "");
		return "goods/stock/errorStock/errorStock";
	}
	
	//입출고 관리
	@GetMapping("/inoutport")
	public String inoutport() {
		return "goods/stock/inoutport/inoutport";
	}
	
	//입출고 내역
	@GetMapping("/inoutportList")
	public String inoutportList() {
		return "goods/stock/inoutportList/inoutportList";
	}
	
	@GetMapping("/realStock")
	public String realStock() {
		return "goods/stock/realStock/realStock";
	}
	
	//재고 현황
	@GetMapping("/stCurrent")
	public String stCurrent() {
		return "goods/stock/stCurrent/stCurrent";
	}
	
	
}
