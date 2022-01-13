package kr.or.test.spring_test.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.test.spring_test.dto.Settlement;
import kr.or.test.spring_test.mapper.PurchaseMapper;





@Service
@Transactional
public class SettlementService {

//생성자 메소드 주입방식 : 
	private final PurchaseMapper PurchaseMapper;
	
	public SettlementService(PurchaseMapper PurchaseMapper) {
		this.PurchaseMapper = PurchaseMapper; 
	}
	
	
	//매입리스트 조회 : Settlement
	public List<Settlement> getsettlementList() {
		List<Settlement> settlementList =  PurchaseMapper.getsettlementList();
				
		return settlementList;
	}



	
	//매출 리스트 조회 : 
	
	
	//상호명 별 리스트 조회
	}
	


