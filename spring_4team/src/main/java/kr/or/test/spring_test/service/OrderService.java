package kr.or.test.spring_test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.test.spring_test.dto.OrderList;
import kr.or.test.spring_test.dto.StaffInfo;
import kr.or.test.spring_test.mapper.OrderMapper;

@Service
@Transactional
public class OrderService {

	private final OrderMapper orderMapper;
	
	@Autowired
	public OrderService(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}
	
	/*
	 * //주문 조회 public List<OrderList> orderListPrint() {
	 * 
	 * List<OrderList> orderList = orderMapper.getorderList();
	 * System.out.println(orderList);
	 * 
	 * return orderList;
	 * 
	 * }
	 */
	
	// 납품 예정리스트 조회 및 검색 ajax
	public List<Map<String, Object>> getPreOrderList(){
		return orderMapper.getPreOrderListAll(null);
	}
	
	public Map<String, Object> getOrderList(int currentPage){
		
		// 보여줄 행의 갯수
		int rowPerPage = 5;
		
		// 로그인 이력 테이블 행의 갯수
		double rowCount = orderMapper.getOrderCount(); //double 소수점형태로 담아짐
	
		// 마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));	
		
		// 페이지 알고리즘
		int startNum = 0;
		startNum = (currentPage - 1) * rowPerPage;
		
		// 보여줄 시작 페이지 번호
		int startPageNum = 1;
		// 보여줄 마지막 페이지 번호
		int endPageNum = 4;
		
		// 동적 페이지 구성( 7페이지 부터 )
		if(currentPage > 3) {
			startPageNum	= currentPage - 1;
			endPageNum		= currentPage + 2;
			if(endPageNum >= lastPage){
				startPageNum = lastPage - 3;
				endPageNum 	 = lastPage;
			}
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> orderList =  orderMapper.getOrderList(paramMap);
		
		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("orderList", orderList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}
	
	//주문검색
	public Map<String, Object> getOrderListBySearch01(int currentPage, String orderSearch01, String orderSearchVal){
		
		// 보여줄 행의 갯수
		int rowPerPage = 5;
		
		// 로그인 이력 테이블 행의 갯수
		double rowCount = orderMapper.getOrderCount(); //double 소수점형태로 담아짐
	
		// 마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));	
		
		// 페이지 알고리즘
		int startNum = 0;
		startNum = (currentPage - 1) * rowPerPage;
		
		// 보여줄 시작 페이지 번호
		int startPageNum = 1;
		// 보여줄 마지막 페이지 번호
		int endPageNum = 4;
		
		// 동적 페이지 구성( 7페이지 부터 )
		if(currentPage > 3) {
			startPageNum	= currentPage - 1;
			endPageNum		= currentPage + 2;
			if(endPageNum >= lastPage){
				startPageNum = lastPage - 3;
				endPageNum 	 = lastPage;
			}
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> orderList =  orderMapper.getOrderListBySearch01(paramMap, orderSearch01, orderSearchVal);
		
		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("orderList", orderList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}
	
	// 납품예정  검색
	public Map<String, Object> getPreOrderSearch(int currentPage, String preOrderSearch, String preOrderSearchVal){
		
		// 보여줄 행의 갯수
		int rowPerPage = 5;
		
		// 로그인 이력 테이블 행의 갯수
		double rowCount = orderMapper.getOrderCount(); //double 소수점형태로 담아짐
		
		// 마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));	
		
		// 페이지 알고리즘
		int startNum = 0;
		startNum = (currentPage - 1) * rowPerPage;
		
		// 보여줄 시작 페이지 번호
		int startPageNum = 1;
		// 보여줄 마지막 페이지 번호
		int endPageNum = 4;
		
		// 동적 페이지 구성( 7페이지 부터 )
		if(currentPage > 3) {
			startPageNum	= currentPage - 1;
			endPageNum		= currentPage + 2;
			if(endPageNum >= lastPage){
				startPageNum = lastPage - 3;
				endPageNum 	 = lastPage;
			}
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> orderList =  orderMapper.getPreOrderList(paramMap, preOrderSearch, preOrderSearchVal);
		
		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("orderList", orderList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}
	
	
	// 납품예정 리스트 	
	public Map<String, Object> getPreOrderList(int currentPage){
		
		// 보여줄 행의 갯수
		int rowPerPage = 5;
		
		// 로그인 이력 테이블 행의 갯수
		double rowCount = orderMapper.getOrderCount(); //double 소수점형태로 담아짐
	
		// 마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));	
		
		// 페이지 알고리즘
		int startNum = 0;
		startNum = (currentPage - 1) * rowPerPage;
		
		// 보여줄 시작 페이지 번호
		int startPageNum = 1;
		// 보여줄 마지막 페이지 번호
		int endPageNum = 4;
		
		// 동적 페이지 구성( 7페이지 부터 )
		if(currentPage > 3) {
			startPageNum	= currentPage - 1;
			endPageNum		= currentPage + 2;
			if(endPageNum >= lastPage){
				startPageNum = lastPage - 3;
				endPageNum 	 = lastPage;
			}
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> orderList =  orderMapper.getPreOrderListAll(paramMap);
		
		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("orderList", orderList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}

	/*
	 * // 신규 발주 등록 public Map<String, Object> orderReg(OrderList orderReg) {
	 * List<Map<String, Object>> result = orderMapper.orderRegInsert(orderReg);
	 * return result; }
	 */
	



}
