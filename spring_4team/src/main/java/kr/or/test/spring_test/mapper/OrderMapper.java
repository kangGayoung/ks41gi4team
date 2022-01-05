package kr.or.test.spring_test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.OrderList;



@Mapper
public interface OrderMapper {

	//직원 조회
	public List<OrderList> getorderList();

	public List<Map<String, Object>> getorderList(Object object);
	
	
	
}
