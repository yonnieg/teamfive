package svc;

import java.sql.Connection;
import static db.JdbcUtil.*;
import dao.MarketDAO;

public class PurListService {

	public boolean purList() {
		Connection con = getConnection();
		MarketDAO marketDAO = new MarketDAO(con);

		boolean isPListSuccess = marketDAO.purList();
		isPListSuccess = true;
		return isPListSuccess;
	}
}
