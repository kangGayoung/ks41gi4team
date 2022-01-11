package kr.or.test.spring_test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.test.spring_test.mapper.BusinessMapper;

@Service
@Transactional
public class BusinessService {

	private final BusinessMapper businessMapper;
	
	
	public BusinessService(BusinessMapper businessMapper) {
		this.businessMapper = businessMapper;
	}


	
	public Map<String, Object> BusinessListPrint(int currentPage) {
		
		int rowPerPage = 5;
		
		double rowCount = businessMapper.getBusinessListCount();
		
		int lastPage = (int) Math.ceil((rowCount/rowPerPage));
		
		int startNum = (currentPage - 1) * rowPerPage;
		
		int startPageNum = 1;
		
		int endPageNum = 4;
		
		if(currentPage > 3) {
			startPageNum = currentPage - 1;
			endPageNum = currentPage + 2;
			if(endPageNum >= lastPage) {
				startPageNum = lastPage - 3;
				endPageNum = lastPage;
			}
		}
		
		
		/* 예제로 작동하는거 확인 후 주석
		if(currentPage > 6) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;
			if(endPageNum >= lastPage) {
				startPageNum = lastPage - 9;
				endPageNum = lastPage;
			}
		}
		*/
		Map<String,Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String,Object>> businessList = businessMapper.BusinessInfoList(paramMap);
		
		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("businessList",businessList);
		paramMap.put("startPageNum",startPageNum);
		paramMap.put("endPageNum",endPageNum);
		
		return paramMap;
		
	}
	
	
	
	
	
}