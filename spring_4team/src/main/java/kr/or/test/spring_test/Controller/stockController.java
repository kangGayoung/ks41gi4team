package kr.or.test.spring_test.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/stock")
public class stockController {
   
   @GetMapping("/useStock")
   public String useStock() {

      return "goods/stock/useStock/useStock";
   }
   
   @GetMapping("/moveStock")
   public String moveStock() {
      
      return "goods/stock/moveStock/moveStock";
   }
   
   @GetMapping("/errorStock")
   public String errorStock() {
      
      return "goods/stock/errorStock/errorStock";
   }
   
   @GetMapping("/realStock")
   public String realStock() {
      
      return "goods/stock/realStock/realStock";
   }
   
}