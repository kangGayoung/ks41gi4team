package kr.or.test.spring_test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusinessMapper {
	
	//거래처 리스트
	public List<Map<String, Object>> BusinessInfoList(Map<String,Object> paramMap);

	public int getBusinessListCount();
}
