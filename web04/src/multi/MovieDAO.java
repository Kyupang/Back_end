package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDAO {

	public int insert(MovieVO bag) {
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
			String sql = "insert into movie VALUES(?,?,?,?)"; // ** 이거 ?가 문법이야.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId()); 
			ps.setString(2, bag.getTitle()); 
			ps.setString(3, bag.getGenres()); 
			ps.setString(4, bag.getDate()); 
			
			
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

}