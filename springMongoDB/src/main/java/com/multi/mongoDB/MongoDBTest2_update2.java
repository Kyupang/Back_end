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

public class MongoDBTest2_update2 {

	public static void main(String[] args) {
		// 1) MongoDB 프로그램에 연결하자.
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. MongoDB 연결 성공!");

		// 2) shop2로 연결!
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공!");

		// 3) member.collection 에 연결!
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3. member Collection 연결 성공!");
		
		Document filter = new Document();
        filter.append("id", "root");

		
		// update할 내용은 bson(json)를 만들어주세요.
        Bson set = Updates.set("name", "final win");
        Bson set2 = Updates.set("tel", "win010");
        List<Bson> list = new ArrayList<Bson>();
        list.add(set);
        list.add(set2);
        
        Bson setts = Updates.combine(list);
        collection.updateOne(filter, setts);
		System.out.println("4. memeber 컬렉션에 insertOne 성공.");
	}
}
