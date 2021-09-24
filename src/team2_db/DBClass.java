package team2_db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBClass {
	public static Connection conn;
	public DBClass() {
		try {
			// 자바에서 오라클 연결하기 위한 기타 기능들을 쓸수 있게 라이브러리 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오라클과 연결된 객체를 가져옵니다
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@210.221.253.215:1521:xe","team222", "team222");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
