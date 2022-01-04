package kr.or.test.spring_test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.test.spring_test.dto.GoodsPrice;

@Mapper
public interface GoodsMapper {
	

	//상품단가표 전체 조회
	public List<GoodsPrice> goodsPriceList();
	
	//재고 조회 (join)
	
}
