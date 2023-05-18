package com.multi.mvc03;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bbs2DAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(Bbs2VO vo) {
		my.insert("bbs2.insert", vo);
	}
}
