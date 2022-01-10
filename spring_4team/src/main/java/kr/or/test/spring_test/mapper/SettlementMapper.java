package kr.or.test.spring_test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;





@Mapper
public interface SettlementMapper<PurchaseLookup> {
	

	//매입리스트 조회 : /purchaseLookup
	public List<PurchaseLookup> purchaseLookupList();
	
	
	//매출리스트 조회 : /salesLookup
	
	
	//거래 전체 조회 :  /orderInvoice
	
	//상품입고 상태조회
	
	//상품 출고 상태 조회
	
}

