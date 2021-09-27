package sign.loginService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Main.DB;
import common.db.DBClass;
import sign.member_dto.MemberDTO;

public class LoginDB {
	public MemberDTO loginCheck(String inputId) {
		String sql = "select * from USERDB where ID=?";
		MemberDTO dto = null;
		try {
			PreparedStatement ps = DB.conn.prepareStatement(sql);
			ps.setString(1, inputId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setId( rs.getString("ID") );
				dto.setName( rs.getString("NAME") );
				dto.setPw(rs.getString("PW") );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}
