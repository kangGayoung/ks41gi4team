package kr.or.test.spring_test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.StaffInfo;



@Mapper
public interface MainMapper {

	//직원 조회
	public List<StaffInfo> getStaffInfo();
	
}
