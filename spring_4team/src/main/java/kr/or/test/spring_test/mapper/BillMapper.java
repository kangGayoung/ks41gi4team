package kr.or.test.spring_test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BillMapper {

	//계산서리스트조회 /taxBillList
	public List<Map<String,Object>> taxBillList(Map<String,Object> paramMap);
	
	public int gettaxBillListCount();
	
}
