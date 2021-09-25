package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sign.member_dto.MemberDTO;

public class DB {
	public static Connection conn;
	public DB() {
		try {
			// 자바에서 오라클 연결하기 위한 기타 기능들을 쓸수 있게 라이브러리 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오라클과 연결된 객체를 가져옵니다
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@210.221.253.215:1521:xe", "team222","team222");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int insert(MemberDTO dto) {
		String sql = "insert into USERDB(NAME,ID,PW) values(?,?,?)";
		int result = 0;
		try {
			// 연결된 객체(conn)을 이용해서 쿼리문(명령어) 전송할 수 있는 전송객체 얻어옴
			PreparedStatement ps = conn.prepareStatement(sql);
			// 쿼리문의 물음표 자리에 값을 채워넣음
			ps.setString(1, dto.getName() );
			ps.setString(2, dto.getId() );
			ps.setString(3, dto.getPw() );
			// 전송객체를 이용해서 명령어 실행(디비에 명령어 전송)
			// 결과값 : 성공 1, 실패 0
			// 보편적으로 select 를 제외한 나머지 명령어는 executeUpdate를 사용한다
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public MemberDTO loginCheck(String inputId) {
		//select * from fx_member where id='111';
		String sql = "select * from USERDB where ID=?";
		MemberDTO dto = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, inputId);
			// ResultSet는 배열과 비슷한 방식으로 가져온다.
			// ResultSet는 select 문에는 무조건 사용한다.
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setId( rs.getString("ID") );
				dto.setPw( rs.getString("PW") );
				dto.setName(rs.getString("NAME") );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}





