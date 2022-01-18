package kr.or.test.spring_test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.StaffInfo;



@Mapper
public interface MainMapper {

	//사원 1명 조회
	public StaffInfo getStaffIdCheckLogin(String staffId);
	
	//직원 조회
	public List<Map<String, Object>> getStaffInfo(Map<String,Object> paramMap);
	// 전체 리스트 수
	public int getStaffInfoListCount();
	//검색 수  (사용안함)
	public int getStaffInfoSearchListCount(String searchKey, String searchValue);
	
	//사원가입처리 
	public int staffInsertAct(StaffInfo staffInfo);
	
	//사원검색
	public List<Map<String, Object>> getStaffInfoSearchList(Map<String,Object> paramMap,String searchKey, String searchValue);
	
	//직원 아이디 중복
	public int getStaffCheck(String staffId);
	
}
