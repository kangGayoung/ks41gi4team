package kr.or.test.spring_test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.OrderList;
import kr.or.test.spring_test.dto.StaffInfo;



@Mapper
public interface OrderMapper {
	
	// 주문 테이블 튜플의 총 갯수
	public int getOrderCount();
	
	// 주문 조회
	public List<Map<String, Object>> getOrderList(Map<String, Object> paramMap);
	
	public List<OrderList> getorderList();

	public List<Map<String, Object>> getorderList(Object object);
	
	// 신규발주등록
	public List<Map<String, Object>> orderRegInsert(OrderList orderReg);

	// 주문 검색
	public List<Map<String, Object>> getOrderListBySearch01(Map<String, Object> paramMap, String orderSearch01, String orderSearchVal);
	
	// 납품 예정리스트 조회 및 검색
	public List<Map<String, Object>> getPreOrderList(Map<String, Object> paramMap, String preOrderSearch, String preOrderSearchVal);

	public List<Map<String, Object>> getPreOrderListAll(Map<String, Object> paramMap);


	

	
	
}
