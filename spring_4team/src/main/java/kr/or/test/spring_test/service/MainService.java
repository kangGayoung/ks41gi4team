package kr.or.test.spring_test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.test.spring_test.dto.StaffInfo;
import kr.or.test.spring_test.mapper.MainMapper;

@Service
@Transactional
public class MainService {

	private final MainMapper mainMapper;
	
	@Autowired
	public MainService(MainMapper mainMapper) {
		this.mainMapper = mainMapper;
	}
	
	
	
	//중복체크
	public int getStaffCheck(String staffId) {
		int result= 0;
		result += mainMapper.getStaffCheck(staffId);
		return result;
	}
	
	//사원조회
	public Map<String, Object>staffInfoPrint(int currentPage) {
		
		int rowPerPage = 5;
		
		double rowCount = mainMapper.getStaffInfoListCount();
		
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
		
		List<Map<String,Object>> staffList = mainMapper.getStaffInfo(paramMap);
		
		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("staffList",staffList);
		paramMap.put("startPageNum",startPageNum);
		paramMap.put("endPageNum",endPageNum);
		
		return paramMap;
		
	}
	
}
