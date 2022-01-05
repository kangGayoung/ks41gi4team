package kr.or.test.spring_test.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.test.spring_test.dto.OrderList;
import kr.or.test.spring_test.mapper.OrderMapper;

@Service
@Transactional
public class OrderService {

	private final OrderMapper orderMapper;
	
	@Autowired
	public OrderService(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}
	
	

	//주문 조회
	public List<OrderList> orderListPrint() {
		
		List<OrderList> orderList = orderMapper.getorderList(); 
		
		System.out.println(orderList);
		 
		return orderList;
		
	}
	/*
	 * public List<Map<String, Object>> getorderList(){ return
	 * orderMapper.getorderList(null); }
	 */
}
