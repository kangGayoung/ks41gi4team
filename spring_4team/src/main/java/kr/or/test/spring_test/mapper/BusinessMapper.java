package kr.or.test.spring_test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.BusinessInfo;

@Mapper
public interface BusinessMapper {
	
	//거래처 등록
	public int BusinessInsert(BusinessInfo businessInfo);
	
	//거래처 리스트
	public List<Map<String, Object>> BusinessInfoList(Map<String,Object> paramMap);

	public int getBusinessListCount();
}
