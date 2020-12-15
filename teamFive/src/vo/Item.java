package vo;

public class Item {

	private String Ino;		// id_sequence로 사용 && Primary key
	private String Iname;	
	private int Iquan;		// 아이템 갯수
	private String Ifrom;
	private String Iprice;

	public String getIno() {
		return Ino;
	}

	public void setIno(String ino) {
		Ino = ino;
	}

	public String getIname() {
		return Iname;
	}

	public void setIname(String iname) {
		Iname = iname;
	}

	public int getIquan() {
		return Iquan;
	}

	public void setIquan(int iquan) {
		Iquan = iquan;
	}

	public String getIfrom() {
		return Ifrom;
	}

	public void setIfrom(String ifrom) {
		Ifrom = ifrom;
	}

	public String getIprice() {
		return Iprice;
	}

	public void setIprice(String iprice) {
		Iprice = iprice;
	}
}
