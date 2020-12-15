package action;

import java.util.Scanner;

import svc.PurchaseAddService;
import util.ConsoleUtil;
import vo.Purchase;

public class PurAddAction implements Action{

	@Override
	public void execute(Scanner sc) throws Exception {
		String logId = null;
		ConsoleUtil cu = new ConsoleUtil();
		Purchase newPurchase = cu.purchase(logId);
		
		PurchaseAddService purchaseAddService = new PurchaseAddService();
		logId = purchaseAddService.addPurchase(newPurchase);
		
	}

}
