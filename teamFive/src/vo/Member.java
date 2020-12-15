package vo;

public class Member {

   private String id;   //primary key
   private String password;
   private String addr;
   private String phone;
   private int point;
   private int cardNum; //포인트 결제 && 탈퇴시 환불용 카드번호_연희

   // ConsoleUtil AddMember에서 사용할 생성자_연희
   public Member(String id, String password, String addr, String phone, int point, int cardNum) {
      this.id = id;
      this.password = password;
      this.addr = addr;
      this.phone = phone;
      this.point = point;
      this.cardNum = cardNum;
   }
   // ConsoleUtil Login에서 사용할 생성자_연희
   public Member(String id, String password) {
      this.id = id;
      this.password = password;
   }
   
   
   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getAddr() {
      return addr;
   }

   public void setAddr(String addr) {
      this.addr = addr;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public int getPoint() {
      return point;
   }

   public void setPoint(int point) {
      this.point = point;
   }

}