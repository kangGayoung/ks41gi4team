package kr.or.test.spring_test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.test.spring_test.dto.BusinessInfo;
import kr.or.test.spring_test.mapper.BusinessMapper;

@Service
@Transactional
public class BusinessService {

	private final BusinessMapper businessMapper;
	
	
	public BusinessService(BusinessMapper businessMapper) {
		this.businessMapper = businessMapper;
	}

	//거래처 등록 쿼리 실행
	public int BusinessInsert(BusinessInfo businessInfo) {
		
		//거래처 코드 생성
		String Bcode = "mb_";
		int cnum = businessMapper.getBusinessListCount();
		 
		Bcode += cnum;
		
		businessInfo.setBusinessCode(Bcode);
		
		int result = businessMapper.BusinessInsert(businessInfo);
		return result;
	}
	
	//dataTable조회
	public List<Map<String,Object>> BusinessList(){
		
		return businessMapper.BusinessInfoList(null);
	}
	
	//businessCode 검색
	public Map<String,Object> BusinessSearchCode(String businessCode){
		
		return businessMapper.businessSearchCode(businessCode);
	}
	

	
	
	
	
}
