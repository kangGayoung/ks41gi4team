package kr.or.test.spring_test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.OrderList;



@Mapper
public interface OrderMapper {
	
	//주문 테이블 튜플의 총 갯수
	public int getOrderCount();
	
	// 주문 조회
	public List<Map<String, Object>> getOrderList(Map<String, Object> paramMap);

	
	public List<OrderList> getorderList();

	public List<Map<String, Object>> getorderList(Object object);
	
	
	
}
