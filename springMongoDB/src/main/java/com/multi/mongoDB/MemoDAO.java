package com.multi.mongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class MemoDAO {
	@Autowired
	MongoTemplate mongo;
	
	public List<MemoVO> list() {
		Query query = new Query();
		query.with(new Sort(Sort.Direction.DESC,"date"));
		List<MemoVO> list = mongo.find(query, MemoVO.class);
		return list;
	}
}
