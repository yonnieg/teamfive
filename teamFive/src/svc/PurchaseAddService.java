package svc;

import java.sql.Connection;

import dao.MarketDAO;
import vo.Purchase;
import static db.JdbcUtil.*;

public class PurchaseAddService {
	public String addPurchase(Purchase newPurchase) {
		Connection con = getConnection();
		MarketDAO marketDAO = new MarketDAO(con);

		String logId = marketDAO.getLogId();

		int addCount = 0;
		addCount++;

		if (addCount > 0) {
			commit(con);
		} else {
			rollback(con);
		}
		return logId;

	}

}
