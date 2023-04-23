package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	public int login(MemberVO bag) {
		int result = 0; // 항목명이랑 결과를 담고 있는 테이블이다.
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// 2. 오라클 11g에 연결해보자. JAVA ------ Oracle
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("2. mySQL 연결 성공.");
			String sql = "select * from member where id=? and pw=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			ResultSet rs = ps.executeQuery();
			
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있으면 TRUE 없으면 false
				System.out.println("검색결과 있음 성공!");
				result = 1;
			}
			System.out.println("검색 결과 없음.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int insert(MemberVO bag) {
		int result = 0;
		try {
			// 1. 마이에스큐엘 11g 와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // **
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");

			// 2. 마이에스큐엘에 연결해보자(java---- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: mysql 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "insert into MEMBER VALUES(?,?,?,?)"; // ** 이거 ?가 문법이야.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			result = ps.executeUpdate(); // **
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int delete(String id) {
		int result = 0;
		try {
			// 1. 마이에스큐엘 11g 와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // **
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");

			// 2. 마이에스큐엘에 연결해보자(java---- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: mysql 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "DELETE FROM MEMBER WHERE ID = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // **
			ps.setString(1, id);

			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			result = ps.executeUpdate(); // **
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(MemberVO bag) {
		int result = 0;
		try {
			// 1. 마이에스큐엘 11g 와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // **
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");

			// 2. 마이에스큐엘에 연결해보자(java---- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: mysql 연결 성공.");
			// 3. SQL 문 만들고
			String sql = "UPDATE MEMBER SET TEL =? WHERE ID= ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());

			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public MemberVO select_one(String id) {
		ResultSet rs = null;
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형)
		MemberVO bag = null;
		try {
			// 1. 마이에스큐엘 11g 와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver"); // **
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");

			// 2. 마이에스큐엘에 연결해보자(java---- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: mysql 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "SELECT * FROM MEMBER WHERE ID = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // **
			ps.setString(1, id);

			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			rs = ps.executeQuery(); // **
			System.out.println("4: DB로 전송 성공.");
			if (rs.next()) {
				System.out.println("검색결과 있음, 성공");
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);

				bag = new MemberVO();

				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
			} else {
				System.out.println("검색결과 없음, 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}
	
	public ArrayList<MemberVO> list(String id) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<MemberVO> list = new ArrayList<>();

		MemberVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from member where id=?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 mysql로 보내기 성공.");
			
			
			
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색겨로가가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 꺼내오자.
				String id2 = rs.getString(1); // id
				String pw = rs.getString(2); // pw
				String name = rs.getString(3); // name
				String tel = rs.getString(4); // tel
				System.out.println( id2 + " "
									+ pw + " " 
									+ name + " " 
									+ tel);
				// 검색결과를 검색화면 UI부분을 주어야 함.
				// 3. 가방을 만들자.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;

	}
	
}