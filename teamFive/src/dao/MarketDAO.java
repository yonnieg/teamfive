package dao;

import static db.JdbcUtil.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.Member;
import vo.Purchase;

public class MarketDAO {
	Connection con;
	static String logid = null;

	public MarketDAO(Connection con) {
		this.con = con;
	}

	public String getLogId() {
		return logid;
	}

	public boolean logcheck(Member member) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select id,password from Member where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (rs.getString(1).equals(member.getPassword())) {
					System.out.println("로그인되었습니다.");
					logid = rs.getString(1);
					return true;
				} else {
					System.out.println("정보가 일치하지 않습니다.");
					return false;
				}
			}
			System.out.println("아이디가 존재하지 않습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public int AddMember(Member Addmember) {
		int addCount = 0;
		PreparedStatement pstmt = null;
		String sql = "Insert into member values(?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, Addmember.getId());
			pstmt.setString(2, Addmember.getPassword());
			pstmt.setString(3, Addmember.getAddr());
			pstmt.setString(4, Addmember.getPhone());
			pstmt.setInt(5, Addmember.getPoint());
			addCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					close(pstmt);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return addCount;
	}

	public boolean purList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isPListSuccess = false;

		String sql = "SELECT * FROM purchase WHERE id = ?";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			pstmt.setString(1, logid);

			while (rs.next()) {
				String logId = rs.getString(1);
				String Pname = rs.getString(2);
				int Pquan = rs.getInt(3);
				String Pdate = rs.getString(4);
				String Pprice = rs.getString(5);

				System.out.printf("ID %s님의 구매내역 입니다. \n 제품명 : %s\n 구매수량 : %d\n " + "총구매액 : %s\n 구매일자 : %s\n", logId,
						Pname, Pquan, Pprice, Pdate);
			}
			isPListSuccess = pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					close(pstmt);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isPListSuccess;
	}
}
