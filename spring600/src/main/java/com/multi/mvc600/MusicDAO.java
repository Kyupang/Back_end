package com.multi.mvc600;

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
public class MusicDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public List<MusicVO> list() {
		List<MusicVO> result = my.selectList("music.all");
		return result;
	}

	
	public MusicVO one(int no) {
		MusicVO result = my.selectOne("music.one",no);
		return result;
	}

	public int delete(int no) {
		int result = my.delete("music.del",no);
		return result;
	}

	public int update(MusicVO bag) {
		int result = my.update("music.up",bag);
		return result;
	}

	// public void add2() {
	public int insert(MusicVO bag) {
		int result = my.insert("music.create",bag);
		return result;
	}

}
