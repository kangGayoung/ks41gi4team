package kr.or.test.spring_test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.test.spring_test.mapper.BillMapper;



@Service
public class BillService {
	
	
@Autowired
private BillMapper billMapper;


	
}

