package action;

import java.util.Scanner;

import svc.PurListService;

public class PurListAction implements Action{

	@Override
	public void execute(Scanner sc) throws Exception {
		
		PurListService purListService = new PurListService();
		boolean isPListSuccess = purListService.purList();
		
		if(isPListSuccess) {
			System.out.println("------ 구매목록 출력 성공 ! ------");
		}else {
			System.out.println("------ 구매목록 출력 실패 ------");
		}
		
	}

}
