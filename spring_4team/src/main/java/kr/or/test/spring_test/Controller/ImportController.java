package kr.or.test.spring_test.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/goods")
public class ImportController {
   
   @GetMapping("/importReg")
   public String importReg(Model model) {
	   model.addAttribute("title", "입고등록화면");

      return "goods/import/importReg";
   }
   
 
	
   
   @GetMapping("/outportReg")
   public String outportReg() {
      return "goods/outport/outportReg";
   }
   
   
   @GetMapping("/dailyReceipt")
   public String dailyReceipt() {
      return "goods/current/dailyReceipt/dailyReceipt";
   }
   
   @GetMapping("/returnList")
   public String returnList() {
      return "goods/current/returnList/returnList";
   }

   @GetMapping("/businessPort")
   public String businessPort() {
      return "goods/current/businessPort/businessPort";
   }
}