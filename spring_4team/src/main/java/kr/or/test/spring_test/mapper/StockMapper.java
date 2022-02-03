package kr.or.test.spring_test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.OrderList;

@Mapper
public interface StockMapper {

	// 입/출고 내역
	public List<Map<String, Object>> getInoutPortAll(Map<String, Object> paramMap);

	// 재고현황
	public List<Map<String, Object>> getStCurrentAll(Map<String, Object> paramMap);
	
}