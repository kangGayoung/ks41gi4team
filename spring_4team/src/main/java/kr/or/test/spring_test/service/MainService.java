package kr.or.test.spring_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.test.spring_test.dto.StaffInfo;
import kr.or.test.spring_test.mapper.MainMapper;

@Service
@Transactional
public class MainService {

	private MainMapper mainMapper;
	
	@Autowired
	public MainService(MainMapper mainMapper) {
		this.mainMapper = mainMapper;
	}
	
	
	//사원조회
	public List<StaffInfo> staffInfoPrint() {
		
		List<StaffInfo> staffList = mainMapper.getStaffInfo()
				; 
		
		/*
		if(staffList != null) { 
			
			for(StaffInfo staff : staffList) {
				
			} 
		} 
		
		*/
		 
		return staffList;
		
	}
	
}
