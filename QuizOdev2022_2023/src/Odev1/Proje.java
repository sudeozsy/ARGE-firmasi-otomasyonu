package Odev1;

public class Proje extends Departman {
	private int depNo,projeID,projeSure,projeMaliyet;
	private String projeAd;
	static int syc=1;
	
	public Proje( String depAd,int projeSure, int projeMaliyet, String projeAd) {
		super( depAd);

		projeID = syc++;
		this.projeSure = projeSure;
		this.projeMaliyet = projeMaliyet;
		this.projeAd = projeAd;
	}

	public int getProjeID() {
		return projeID;
	}

	public int getProjeSure() {
		return projeSure;
	}

	public int getProjeMaliyet() {
		return projeMaliyet;
	}

	public String getProjeAd() {
		return projeAd;
	}

}
