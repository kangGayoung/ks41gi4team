package kr.or.test.spring_test.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.test.spring_test.service.OrderService;
import kr.or.test.spring_test.service.StockService;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	
	private StockService stockService;

	// 의존성 주입
	public StockController(StockService stockService) {
		this.stockService = stockService;
	}

	//입출고 관리
	@GetMapping("/inoutport")
	public String inoutport() {
		return "goods/stock/inoutport/inoutport";
	}
	
	// 입출고 관리 ajax
	@PostMapping("/inoutport")
	@ResponseBody
	public List<Map<String, Object>> inoutPort() {
		List<Map<String, Object>> inoutport = stockService.getInoutPort();		

		return inoutport;
	}
	
	//입출고 내역
	@GetMapping("/inoutportList")
	public String inoutportList() {
		return "goods/stock/inoutportList/inoutportList";
	}
		
	// 입출고 내역 ajax
	@PostMapping("/inoutportList")
	@ResponseBody
	public List<Map<String, Object>> inoutPortList() {
		List<Map<String, Object>> inoutportList = stockService.getInoutPort();		

		return inoutportList;
	}
	
	//재고 현황
	@GetMapping("/stCurrent")
	public String stCurrent() {
		return "goods/stock/stCurrent/stCurrent";
	}
	
	// 재고 현황 ajax
	@PostMapping("/stCurrent")
	@ResponseBody
	public List<Map<String, Object>> stCurrentList() {
		List<Map<String, Object>> stCurrentList = stockService.getStCurrent();		

		return stCurrentList;
	}
}
