package action;

import java.util.Scanner;

import svc.Memberloginservice;
import ui.MarketUi;
import util.ConsoleUtil;
import vo.Member;

public class MemberListAction implements Action {
	
	@Override
	public void execute(Scanner sc) throws Exception {
		MarketUi mu = new MarketUi();
		ConsoleUtil cu = new ConsoleUtil();
		Member login = cu.Login();
		Memberloginservice mos = new Memberloginservice();

		boolean loginsucess = mos.loginmember(login);
		if (loginsucess) {
			System.out.println("------ 로그인 성공! ------- ");
			mu.memberView();
		} 
		else {
			System.out.println("------ 로그인 실패 ------ ");
		}
	}
}
