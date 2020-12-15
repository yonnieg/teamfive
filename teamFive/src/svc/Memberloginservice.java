package svc;

import static db.JdbcUtil.getConnection;

import java.sql.Connection;

import dao.MarketDAO;
import vo.Member;
import static db.JdbcUtil.*;

public class Memberloginservice {
	public boolean loginmember(Member NewMember) {

		boolean islog = false;
		Connection con = getConnection();
		MarketDAO md = new MarketDAO(con);
		boolean logche = md.logcheck(NewMember);

		if (logche) {
			commit(con);
			islog = true;
		}
		return islog;
	}
}
