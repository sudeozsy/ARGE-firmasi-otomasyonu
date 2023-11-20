package Odev1;

import java.util.Scanner;

public class AnaSayfa {
	public static void main(String[] args) {
		int topDep,depNo,topPer,topProje,perYas,projeSure,projeMaaliyet;
		String depAd,perAd,perSoyad,projeAd;
		Scanner r = new Scanner(System.in);
		
		System.out.print("Kac tane departman var?: ");
		topDep = r.nextInt();
		
		Departman[] departman = new Departman[topDep];
		
		for(int i=0;i<topDep;i++)
		{
			System.out.print((i+1)+". Departman No:");
			depNo = r.nextInt();
			System.out.print("Departman Ad:");
			depAd = r.next();
			System.out.print("Kac tane personel var?: ");
			topPer = r.nextInt();
			departman[i] = new Departman(depAd);
			departman[i].getDepNo();
			departman[i].setDepNo(depNo);
			
			departman[i].personeller = new Personel[topPer];
			for(int j=0;j<topPer;j++)
			{
				System.out.print((j+1)+". Personel Ad:");
				perAd = r.next();
				System.out.print("Personel Soyad:");
				perSoyad = r.next();
				System.out.print("Personel Yas:");
				perYas = r.nextInt();
				departman[i].personeller[j] = new Personel(depAd,perYas,perAd,perSoyad);
			}
			System.out.print("Kac tane proje var?: ");
			topProje = r.nextInt();
			
			departman[i].projeler = new Proje[topProje];
			for(int k=0;k<topProje;k++)
			{
				System.out.print((k+1)+". Proje Ad:");
				projeAd = r.next();
				System.out.print("Proje Sure(Ay cinsinden):");
				projeSure = r.nextInt();
				System.out.print("Proje Maaliyet(TL):");
				projeMaaliyet = r.nextInt();
				
				departman[i].projeler[k] = new Proje(depAd,projeSure,projeMaaliyet,projeAd);
			}
			
		}
		Menu(departman);
	}
	public static void Menu(Departman[] departman)
	{
		int secim;
		Scanner r = new Scanner(System.in);
		System.out.println("1- Tüm Departmanların Bilgilerini Listele\r\n"
				+ "2- Departman Adına Göre Arama Yap\r\n"
				+ "3- Personel Adına Göre Arama Yap\r\n"
				+ "4- Proje Adına Göre Arama Yap\r\n"
				+ "5- Yaş Bilgisine Göre Personelleri Bul\r\n"
				+ "6- Yaş Bilgisine Göre Personelleri Analiz Et\r\n"
				+ "7- Proje Süresine Göre Projeleri Bul\r\n"
				+ "8- Proje Maliyetine Göre Projeleri Bul\r\n"
				+ "9- Proje Maliyetine Göre Projeleri Analiz Et\r\n"
				+ "10- Çıkış"+"\n\tSecin:");
		secim = r.nextInt();
		switch(secim)
		{
		case 1:
			BilgileriListele(departman);
			break;
		case 2:
			DepartmanAra(departman);
			break;
		case 3:
			PersonelAra(departman);
			break;
		case 4:
			ProjeAra(departman);
			break;
		case 5:
			YasaGoreBul(departman);
			break;
		case 6:
			YasaGoreAnaliz(departman);
			break;
		case 7:
			SureyeGoreBul(departman);
			break;
		case 8:
			MaaliyeteGoreBul(departman);
			break;
		case 9:
			MaaliyeteGoreAnalizEt(departman);
			break;
		case 10:
			
		default:
		}
	}
	public static void BilgileriListele(Departman[] departman)
	{
		for(int i=0;i<departman.length;i++)
		{
			System.out.println("Departman No: "+departman[i].getDepNo()+"  Departman Ad: "+departman[i].getDepAd());
			System.out.println("Personeller:");
			for(int j=0;j<departman[i].personeller.length;j++)
			{
				System.out.print("\t\t");
				System.out.print((j+1)+".Personel:"+departman[i].personeller[j].getPerID()+" ");
				System.out.print(departman[i].personeller[j].getPerAd()+" ");
				System.out.print(departman[i].personeller[j].getPerSoyad()+" ");
				System.out.println(departman[i].personeller[j].getPerYas());
			}
			System.out.println("Projeler:");
			for(int j=0;j<departman[i].projeler.length;j++)
			{
				System.out.print("\t\t");
				System.out.print((j+1)+".Proje:"+departman[i].projeler[j].getProjeID()+" ");
				System.out.print(departman[i].projeler[j].getProjeAd()+" ");
				System.out.print(departman[i].projeler[j].getProjeSure()+" ");
				System.out.println(departman[i].projeler[j].getProjeMaliyet());
			}
		}
		Menu(departman);
	}
	public static void DepartmanAra(Departman[] departman)
	{
		int kontrol = 0;
		String aranan;
		Scanner r = new Scanner(System.in);
		System.out.print("Aranacak departmanın adını girin: ");
		aranan = r.next();
		
		for(int i=0;i<departman.length;i++)
		{
			if(aranan.equals(departman[i].getDepAd()))
			{
				System.out.println("Departman No: "+departman[i].getDepNo()+"  Departman Ad: "+departman[i].getDepAd());
				System.out.println("Personeller:");
				for(int j=0;j<departman[i].personeller.length;j++)
				{
					System.out.print("\t\t");
					System.out.print((j+1)+".Personel:"+departman[i].personeller[j].getPerID()+" ");
					System.out.print(departman[i].personeller[j].getPerAd()+" ");
					System.out.print(departman[i].personeller[j].getPerSoyad()+" ");
					System.out.println(departman[i].personeller[j].getPerYas());
				}
				System.out.println("Projeler:");
				for(int j=0;j<departman[i].projeler.length;j++)
				{
					System.out.print("\t\t");
					System.out.print((j+1)+".Proje:"+departman[i].projeler[j].getProjeID()+" ");
					System.out.print(departman[i].projeler[j].getProjeAd()+" ");
					System.out.print(departman[i].projeler[j].getProjeSure()+" ");
					System.out.println(departman[i].projeler[j].getProjeMaliyet());
				}
				kontrol = 1;
			}
		}
		if(kontrol == 0)
		{
			System.out.println("--Bulunamadı.");
		}
		Menu(departman);
	}
	public static void PersonelAra(Departman[] departman) 
	{
		int kontrol = 0;
		String aranan;
		Scanner r = new Scanner(System.in);
		System.out.print("Aranacak personelin adını girin: ");
		aranan = r.next();
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].personeller.length;j++)
			{
				if(aranan.equals(departman[i].personeller[j].getPerAd()))
				{
					System.out.print("Personel:"+departman[i].personeller[j].getPerID()+" ");
					System.out.print(departman[i].personeller[j].getPerAd()+" ");
					System.out.print(departman[i].personeller[j].getPerSoyad()+" ");
					System.out.print(departman[i].personeller[j].getPerYas());
					System.out.println("\t Departman: "+departman[i].personeller[j].getDepAd());
					kontrol = 1;
				}
			}
		}
		if(kontrol == 0)
		{
			System.out.println("--Bulunamadı.");
		}
		Menu(departman);
	}
	public static void ProjeAra(Departman[] departman)
	{
		int kontrol = 0;
		String aranan;
		Scanner r = new Scanner(System.in);
		System.out.print("Aranacak personelin adını girin: ");
		aranan = r.next();
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].projeler.length;j++)
			{
				if(aranan.equals(departman[i].projeler[j].getProjeAd()))
				{
					System.out.print("Proje:"+departman[i].projeler[j].getProjeID()+" ");
					System.out.print(departman[i].projeler[j].getProjeAd()+" ");
					System.out.print(departman[i].projeler[j].getProjeSure()+" ");
					System.out.println(departman[i].projeler[j].getProjeMaliyet());
					System.out.println("\t Departman: "+departman[i].projeler[j].getDepAd());
					kontrol = 1;
				}
			}
		}
		if(kontrol == 0)
		{
			System.out.println("--Bulunamadı.");
		}
		Menu(departman);
	}
	public static void YasaGoreBul(Departman[] departman)
	{
		int kontrol = 0,aranan;
		
		Scanner r = new Scanner(System.in);
		System.out.print("Aranacak yas : ");
		aranan = r.nextInt();
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].personeller.length;j++)
			{
				if(aranan == departman[i].personeller[j].getPerYas())
				{
					System.out.print("Personel:"+departman[i].personeller[j].getPerID()+" ");
					System.out.print(departman[i].personeller[j].getPerAd()+" ");
					System.out.print(departman[i].personeller[j].getPerSoyad()+" ");
					System.out.print(departman[i].personeller[j].getPerYas());
					System.out.println("\t Departman: "+departman[i].personeller[j].getDepAd());
					kontrol = 1;
				}
			}
		}
		if(kontrol == 0)
		{
			System.out.println("--Bulunamadı.");
		}
		Menu(departman);
	}
	public static void YasaGoreAnaliz(Departman[] departman)
	{
		int yirmi=0,otuz=0,kırk=0,elli=0,top=0,topkisi=0;
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].personeller.length;j++)
			{
				if(20<=departman[i].personeller[j].getPerYas() && departman[i].personeller[j].getPerYas() <=30)
				{
					yirmi++;
				}
				else if(departman[i].personeller[j].getPerYas() <=40)
				{
					otuz++;
				}
				else if(departman[i].personeller[j].getPerYas() <=50)
				{
					kırk++;
				}
				else
				{
					elli++;
				}
				top +=departman[i].personeller[j].getPerYas();
			}
			topkisi += departman[i].personeller.length ;
		}
		System.out.println("20-30 Yas Araligindaki Personel Sayisi: "+yirmi);
		System.out.println("31-40 Yas Araligindaki Personel Sayisi: "+otuz);
		System.out.println("41-50 Yas Araligindaki Personel Sayisi: "+kırk);
		System.out.println(">50 Yas Personel Sayisi: "+elli);
		System.out.println("Tüm Personellerin Yas Ortalaması: "+top/topkisi);
		Menu(departman);
	}
	public static void SureyeGoreBul(Departman[] departman)
	{
		int kontrol = 0,aranan;
	
		Scanner r = new Scanner(System.in);
		System.out.print("Aranacak sure : ");
		aranan = r.nextInt();
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].projeler.length;j++)
			{
				if(aranan == departman[i].projeler[j].getProjeSure())
				{
					System.out.print("Proje:"+departman[i].projeler[j].getProjeID()+" ");
					System.out.print(departman[i].projeler[j].getProjeAd()+" ");
					System.out.print(departman[i].projeler[j].getProjeSure()+" ");
					System.out.println(departman[i].projeler[j].getProjeMaliyet());
					System.out.println("\t Departman: "+departman[i].projeler[j].getDepAd());
					kontrol = 1;
				}
			}
		}
		if(kontrol == 0)
		{
			System.out.println("--Bulunamadı.");
		}
		Menu(departman);
	}
	public static void MaaliyeteGoreBul(Departman[] departman)
	{
		int kontrol = 0,aranan;
		
		Scanner r = new Scanner(System.in);
		System.out.print("Aranacak maaliyet : ");
		aranan = r.nextInt();
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].projeler.length;j++)
			{
				if(aranan == departman[i].projeler[j].getProjeMaliyet())
				{
					System.out.print("Proje:"+departman[i].projeler[j].getProjeID()+" ");
					System.out.print(departman[i].projeler[j].getProjeAd()+" ");
					System.out.print(departman[i].projeler[j].getProjeSure()+" ");
					System.out.println(departman[i].projeler[j].getProjeMaliyet());
					System.out.println("\t Departman: "+departman[i].projeler[j].getDepAd());
					kontrol = 1;
				}
			}
		}
		if(kontrol == 0)
		{
			System.out.println("--Bulunamadı.");
		}
		Menu(departman);
	}
	public static void MaaliyeteGoreAnalizEt(Departman[] departman)
	{
		String maxAd = null ,minAd = null;
		int top=0,topproje=0,maxM = 0,minM =0;
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].projeler.length;j++)
			{
				
				if(departman[i].projeler[j].getProjeMaliyet()>maxM)
				{
					maxAd = departman[i].projeler[j].getProjeAd();
					maxM = departman[i].projeler[j].getProjeMaliyet();
				}
				if(departman[i].projeler[j].getProjeMaliyet()<maxM)
				{
					minAd = departman[i].projeler[j].getProjeAd();
					minM = departman[i].projeler[j].getProjeMaliyet();
				}
				top += maxM = departman[i].projeler[j].getProjeMaliyet();
			}
			topproje += departman[i].projeler.length;
		}
		System.out.println("En Yuksek Maliyetli Proje: "+maxAd+" "+maxM);
		System.out.println("En Dusuk Maliyetli Proje: "+minAd+" "+minM);
		System.out.println("Tum Projeleriin Ortalama Maaliyeti: "+top/topproje);
		Menu(departman);
	}
}
