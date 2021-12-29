package kr.or.test.spring_test.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/stock")
public class StockController {
   
   @GetMapping("/inoutport")
   public String inoutport() {

      return "stock/inoutport/inoutport";
   }
   
   @GetMapping("/inoutportList")
   public String inoutportList() {
      
      return "stock/inoutportList/inoutportList";
   }
   
   @GetMapping("/errorStock")
   public String errorStock() {
      
      return "stock/errorStock/errorStock";
   }
   
   @GetMapping("/realStock")
   public String realStock() {
      
      return "stock/realStock/realStock";
   }
   
   @GetMapping("/stCurrent")
   public String stCurrent() {
	   
	   return "stock/stCurrent/stCurrent";
   }
   
}