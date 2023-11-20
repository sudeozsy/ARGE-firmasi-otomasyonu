package Odev1;

public class Departman {
	private int depNo;
	private String depAd;
	public Personel[] personeller;
	public Proje[] projeler;
	
	public Departman( String depAd) {
		super();
		this.depAd = depAd;
	}

	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}

	public String getDepAd() {
		return depAd;
	}

	
}
