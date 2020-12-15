package util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import vo.Member;
import vo.Purchase;

public class ConsoleUtil {
   Scanner sc = new Scanner(System.in);

   public Member AddMember() {
      System.out.println("====== 회원가입 ======");
      System.out.print("아이디 >> ");
      String id = sc.nextLine();
      System.out.print("비밀번호 >> ");
      String password = sc.nextLine();
      System.out.print("주소 >> ");
      String addr = sc.nextLine();
      System.out.print("전화번호 >> ");
      String phone = sc.nextLine();
      System.out.print("출금할 카드번호 입력 >> ");
      int cardNum = sc.nextInt();
      sc.nextLine();
      System.out.print("충전할 포인트를 입력하세요 >> ");
      int point = sc.nextInt();
      sc.nextLine();

      return new Member(id, password, addr, phone, point, cardNum);
   }

   public Member Login() {
      System.out.println("====== 로그인 ======");
      System.out.print("아이디 >> ");
      String id = sc.nextLine();
      System.out.print("비밀번호 >> ");
      String password = sc.nextLine();

      return new Member(id, password);
   }

   public Purchase purchase(String logId) {

      System.out.println("====== 상품 구매 ======");
      System.out.print("구매 상품 코드 입력 >> ");
      int Pno = sc.nextInt();
      sc.nextLine();
      System.out.print("구매할 갯수 입력 >> ");
      int Pquan = sc.nextInt();
      sc.nextLine();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      String Pdate = sdf.format(new Date());
      Purchase purchase = new Purchase(logId, Pno, Pquan, Pdate);

      return purchase;

   }

   public void purPrompt(String logId) {
      System.out.print("계속 구매하시겠습니까? (y/n) >> ");
      String answer = sc.nextLine();

      switch (answer.toLowerCase()) {
      case "y":
         purchase(logId);
         break;
      case "n":
         return;
      }
   }
}