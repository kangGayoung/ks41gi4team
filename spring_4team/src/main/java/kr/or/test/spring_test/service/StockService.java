package kr.or.test.spring_test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.test.spring_test.mapper.StockMapper;

@Service
@Transactional
public class StockService {

	private final StockMapper stockMapper;
	
	@Autowired
	public StockService(StockMapper stockMapper) {
		this.stockMapper = stockMapper;
	}
	
	// 입출고 내역 ajax
	public List<Map<String, Object>> getInoutPort() {		
		return stockMapper.getInoutPortAll(null);			
	}

	// 재고 현황 ajax
	public List<Map<String, Object>> getStCurrent() {
		return stockMapper.getStCurrentAll(null);
	}
}
	