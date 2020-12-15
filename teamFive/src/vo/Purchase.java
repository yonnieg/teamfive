package vo;

public class Purchase {

	private String LogId; // primary key
	private int Pno; // 구매상품코드 추가_연희
	private String Pname;
	private int Pquan; // 구매 갯수
	private String Pdate;
	private String Pprice;

	// consoleUtil PurchaseList에서 사용할 생성자
	public Purchase(String LogId, int Pno, int Pquan, String Pdate) {
		this.Pno = Pno;
		this.Pquan = Pquan;
		this.Pdate = Pdate;
	}

	public String getLogId() {
		return LogId;
	}

	public void setLogId(String logId) {
		LogId = logId;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getPquan() {
		return Pquan;
	}

	public void setPquan(int pquan) {
		Pquan = pquan;
	}

	public String getPdate() {
		return Pdate;
	}

	public void setPdate(String pdate) {
		Pdate = pdate;
	}

	public String getPprice() {
		return Pprice;
	}

	public void setPprice(String pprice) {
		Pprice = pprice;
	}
}