package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest_practice {

	public static void main(String[] args) {

		// 1. 몽고DB 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고db 프로그램에 연결 성공."); // 연결 콘솔 확인
		// 2. shop2로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공.");

		// 3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. memo 컬렉션에 연결 성공.");

		// 1.

		// a. insertOne
		// Document doc = new Document();
		// doc.append("age", 500);
		// doc.append("name", "song");
		// doc.append("office", "busan");
		// doc.append("phone", "011");

		// collection.insertOne(doc);

		// b. insertMany

		// Document doc = new Document();
		// doc.append("age", 501);
		// doc.append("name", "song2");
		// doc.append("office", "busan");
		// doc.append("phone", "011");

		// Document doc2 = new Document();
		// doc2.append("age", 502);
		// doc2.append("name", "song3");
		// doc2.append("office", "seoul");
		// doc2.append("phone", "011");

		// Document doc3 = new Document();
		// doc3.append("age", 503);
		// doc3.append("name", "song4");
		// doc3.append("office", "busan");
		// doc3.append("phone", "011");

		// List<Document> list = new ArrayList<Document>();
		// list.add(doc);
		// list.add(doc2);
		// list.add(doc3);

		// collection.insertMany(list);

		// 2.

		// a. deleteOne

		// Document filter = new Document();
		// filter.append("age", 500);

		// collection.deleteOne(filter);

		// 3.

		// a. updateOne
		// Document filter = new Document();
		// filter.append("age", 501);
		// Bson set = Updates.set("name", "songsong");
		// collection.updateOne(filter, set);

		// b. updateMany
		Document filter = new Document();
		filter.append("office", "busan");

		Bson set = Updates.set("phone", "9999");
		Bson set2 = Updates.set("name", "songsong2");
		Bson set3 = Updates.set("age", 555);

		List<Bson> list = new ArrayList<Bson>();
		list.add(set);
		list.add(set2);
		list.add(set3);

		Bson setts = Updates.combine(list);

		collection.updateMany(filter, setts);

	}

}
