package kr.or.test.spring_test.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import kr.or.test.spring_test.mapper.BillMapper;



@Service
public class BillService {
	
	

	private BillMapper billMapper;
	
	public BillService(BillMapper billMapper) {
		this.billMapper = billMapper;
	}

			// 세금 리스트 조회
		public List<Map<String,Object>>taxBillList(){
			return billMapper.taxBillList(null);
		}
	
}

