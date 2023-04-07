package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//테이블 하나당 DAO하나! ==> CUD를 완성!! 
@Component
public class BbsDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public List<BbsVO> list() {
		List<BbsVO> result = my.selectList("bbs.all");
		return result;
	}

	
	public BbsVO one(int no) {
		BbsVO result = my.selectOne("bbs.one",no);
		return result;
	}

	public int delete(int no) {
		int result = my.delete("bbs.del",no);
		return result;
	}

	public int update(BbsVO bag) {
		int result = my.update("bbs.up",bag);
		return result;
	}

	// public void add2() {
	public int insert(BbsVO bag) {
		int result = my.insert("bbs.create",bag);
		return result;
	}

}
