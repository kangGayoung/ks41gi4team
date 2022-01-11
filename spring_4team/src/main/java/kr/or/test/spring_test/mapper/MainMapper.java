package kr.or.test.spring_test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.StaffInfo;



@Mapper
public interface MainMapper {

	//직원 조회
	public List<Map<String, Object>> getStaffInfo(Map<String,Object> paramMap);
	
	public int getStaffInfoListCount();
	
	//사원검색
	public List<StaffInfo> getStaffInfoSearchList(String searchKey, String searchValue);
	
	//직원 아이디 중복
	public int getStaffCheck(String staffId);
	
}
