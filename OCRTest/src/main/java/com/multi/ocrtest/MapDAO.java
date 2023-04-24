package com.multi.ocrtest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapDAO {
	@Autowired
	//DI
	SqlSessionTemplate my;
	
	public int insert(MapVO bag) {
		int result = my.insert("map.create", bag);
		return result;
		
		//일단 사진을 찍고 2번 등록됐을때 등록을하면 주소를 통해 마커를 찍고 DB에 넣어 
		// 웹브라우저를 껐다 켜도 있게끔 디비에서 다 list를 가져와. 
		//(DB에 넣어서 넣을때 주소를 가지고 기존 맛집 데이터의 가게 주소와 일치하면 (기존 맛집에 있는 정보의 컬럼을 선택해서 윤서님 DB에 골라 넣어야함.) 집어넣고 없으면 주소를 잘 보이게끔 사진을 다시 등록하거나, 혹은 다른 조치를 취해야함..) 
	}
}		
