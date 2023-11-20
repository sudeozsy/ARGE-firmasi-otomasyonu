package Odev1;

public class Personel extends Departman{
	private int depNo,perID,perYas;
	private String perAd,perSoyad;
	static int syc = 20;
	
	public Personel( String depAd,int perYas, String perAd, String perSoyad) {
		super(depAd);
		
		perID = syc++;
		this.perYas = perYas;
		this.perAd = perAd;
		this.perSoyad = perSoyad;
	}

	public int getPerID() {
		return perID;
	}

	public int getPerYas() {
		return perYas;
	}

	public String getPerAd() {
		return perAd;
	}

	public String getPerSoyad() {
		return perSoyad;
	}
	
}
