package kr.or.test.spring_test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.StaffInfo;



@Mapper
public interface MainMapper {

	//직원 조회
	public List<StaffInfo> getStaffInfo();
	
	//직원 아이디 중복
	public int getStaffCheck(String staffId);
	
}
