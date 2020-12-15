package ui;

import java.util.Scanner;

import action.Action;
import action.ItemListAction;
import action.MemberAddAction;
import action.MemberListAction;
import action.PurListAction;
import controller.MemberController;

public class MarketUi {
   MemberController mc = new MemberController();
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      boolean isStop = false;
      Scanner sc = new Scanner(System.in);

      do {
         System.out.println("======= 오케아 가구상점에 오신것을 환영합니다! =======");
         System.out.println("1. 회원가입");
         System.out.println("2. 로그인");
         System.out.println("0. 나가기");
         System.out.print("번호를 입력해주세요 >> ");
         String select = sc.nextLine();

         switch (select) { // 메서드만 구현
         case "1":
            register();
            break;

         case "2":
            loginView();
            break;

         case "0":
            isStop = true;
            break;

         default:
            System.out.println("잘못입력하셨습니다.");
         }

      } while (!isStop);

   }

   public static void register() {
      Action action = null;
      action = new MemberAddAction();
   }

   public static void loginView() {
      Action action = null;
      action = new MemberListAction();
   }

   public void memberView() {
      Action action = null;
      
      while (true) {
         System.out.println("====== 회원서비스 ======");
         System.out.println("1. 상품구매");
         System.out.println("2. 거래내역 보기");
         System.out.println("3. 내 포인트 확인");
         System.out.println("0. 뒤로가기");
         System.out.print("번호를 입력해주세요 >> ");
         String select = sc.nextLine();

         switch (select) {

         case "1":
            action = new ItemListAction();
            break;
         case "2":
            action = new PurListAction();
            break;
         case "3":
            action = new MemberListAction();
            break;
         case "0":
            return;
         }
      }

   }

}