package kr.or.test.spring_test.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.test.spring_test.dto.SettlementDto;
import kr.or.test.spring_test.mapper.SettlementMapper;





@Service
@Transactional
public class SettlementService {

@Autowired
	private final SettlementMapper settlementMapper;
	
	public SettlementService(SettlementMapper settlementMapper) {
		this.settlementMapper = settlementMapper; 
	}
	


	
	//매입리스트 조회 : \settlement\settlementResult\purchaseList.html

	public List<Map<String,Object>>SelectPurchaseList(){
		
		return settlementMapper.SelectPurchaseList(null);
}
	
	
	
	
	//매출 리스트 조회 : 
	
	
	//상호명 별 리스트 조회
	}
	


