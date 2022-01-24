package kr.or.test.spring_test.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SettlementMapper {
	

	//매입리스트 조회 : /selectPurchaseList
 public List<Map<String,Object>> selectPurchaseList(Map<String,Object> paramMap);
 
 public int getPurchaseListCount();

}


	//매출리스트 조회 : /salesLookup
	
	
	//거래 전체 조회 :  /orderInvoice
	
