package com.gyu.mvc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Component;

//테이블 하나당 DAO하나! ==> CUD를 완성!! 
@Component
public class WebtoonDAO {
	
	public ArrayList<WebtoonVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<WebtoonVO> list = new ArrayList<>();

		WebtoonVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");
			// 컨트롤 + 쉬프트 + f : 코드 자동 정리!

			String sql = "select * from webtoon";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색결과가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				System.out.println("검색결과 있음. 성공.");
				String id = rs.getString(1); // id
				String title = rs.getString(2); 
				String cartoonist = rs.getString(3); 
				String star = rs.getString(4); 
				String img = rs.getString(5); 
				// 검색결과를 검색화면 UI부분을 주어야 함.
				bag = new WebtoonVO();
				bag.setId(id);
				bag.setTitle(title);
				bag.setCartoonist(cartoonist);
				bag.setStar(star);
				bag.setImg(img);

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

	
	public WebtoonVO one(int id) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		WebtoonVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from webtoon where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select의 결과는 <항목명+Row> 테이블!!
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음. 성공.");
				String id1 = rs.getString(1); // id
				String title = rs.getString(2); 
				String cartoonist = rs.getString(3); 
				String star = rs.getString(4); 
				String img = rs.getString(5); 
				// 검색결과를 검색화면 UI부분을 주어야 함.
				bag = new WebtoonVO();
				bag.setId(id1);
				bag.setTitle(title);
				bag.setCartoonist(cartoonist);
				bag.setStar(star);
				bag.setImg(img);
			} else {
				System.out.println("검색결과 없음. 성공.");
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return bag;

	}

//	public void delete(String name) {
//		try {
//			// 1.오라클 11g와 연결한 부품 설정
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
//			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!
//
//			// 2.오라클 11g에 연결해보자.(java --- oracle)
//			// String url = "jdbc:mysql://localhost:3306/multi";
//			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
//			String user = "root";
//			String password = "1234";
//			Connection con = DriverManager.getConnection(url, user, password); // Connection
//			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
//			System.out.println("2. mySQL 연결 성공.");
//
//			String sql = "delete from multi.book where name =?";
//			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
//			ps.setString(1, name);
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
//
//			ps.executeUpdate();
//			System.out.println("4. SQL문 오라클로 보내기 성공.");
//
//			// System.out.println(result);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public void update(WebtoonVO bag) {
//		try {
//			// 1.오라클 11g와 연결한 부품 설정
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
//			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!
//
//			// 2.오라클 11g에 연결해보자.(java --- oracle)
//			// String url = "jdbc:mysql://localhost:3306/multi";
//			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
//			String user = "root";
//			String password = "1234";
//			Connection con = DriverManager.getConnection(url, user, password); // Connection
//			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
//			System.out.println("2. mySQL 연결 성공.");
//
//			String sql = "update multi.book set url = ? where name = ? ";
//			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
//			ps.setString(1, bag.getUrl());
//			ps.setString(2, bag.getName());
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
//
//			ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
//			System.out.println("4. SQL문 오라클로 보내기 성공.");
//
//			// System.out.println(result);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// public void add2() {
//	public void insert(WebtoonVO bag) {
//
//		try {
//			// 1.오라클 11g와 연결한 부품 설정
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
//			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!
//
//			// 2.오라클 11g에 연결해보자.(java --- oracle)
//			// String url = "jdbc:mysql://localhost:3306/multi";
//			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
//			String user = "root";
//			String password = "1234";
//			Connection con = DriverManager.getConnection(url, user, password); // Connection
//			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
//			System.out.println("2. mySQL 연결 성공.");
//
//			String sql = "insert into multi.book values (null,?,?,?)";
//			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
//			
//			ps.setString(1, bag.getName());
//			ps.setString(2, bag.getUrl());
//			ps.setString(3, bag.getImage());
//			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
//
//			ps.executeUpdate();
//			System.out.println("4. SQL문 오라클로 보내기 성공.");
//
//			// System.out.println(result);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

}
