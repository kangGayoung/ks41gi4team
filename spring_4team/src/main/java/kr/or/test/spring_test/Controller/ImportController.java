package kr.or.test.spring_test.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ImportController {
	
	@GetMapping("/importReg")
	public String importReg() {

		return "goods/import/importReg";
	}
	
	@GetMapping("/outportReg")
	public String outportReg() {
		return "goods/outport/outportReg";
	}

}
