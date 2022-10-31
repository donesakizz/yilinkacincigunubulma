package forOrnek;

import javax.swing.JOptionPane; //ekrandan okutma için gerekli

public class yilinkacincigunu
{  
	static int TamSayiGirisi()
	{
		String TamSayi = JOptionPane.showInputDialog(null,"Bir Tam Sayı Gir:" ,"Girilecek Tam Sayı",
				JOptionPane.QUESTION_MESSAGE);
		// TamSayi stringini tam sayıya cevirme:
		int DonusDegeri = Integer.parseInt(TamSayi);
		return DonusDegeri; 
	}
	

	public static void main(String[] args) 
	{
		int yil,ay,gun,ToplamGunSayisi;
		   // Tam sayi tipli dizi bildirimleri:
		
		int [] AydakiGunSayisi1 = { 31,28,31,30,31,30,31,31,30,31,30,31};
		
		int [] AydakiGunSayisi2 = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("Yılı tam sayı olarak gir :");
		yil = TamSayiGirisi();
		System.out.println("yıl=" +yil );
		System.out.println();
		
		System.out.print("Ayı 1 ile 12 arasında ...gir  :");
		ay = TamSayiGirisi();
		System.out.println("Ay =" +ay );
		System.out.println();
		
		System.out.print("Günü 1 ile 12 arasında ...gir  :");
		gun = TamSayiGirisi();
		System.out.println("Gün =" +gun );
		System.out.println();
		
		ToplamGunSayisi = gun;
		for(int i =0; i<ay -1 ;i++)
			if(yil % 4 ==0)
			ToplamGunSayisi = ToplamGunSayisi +AydakiGunSayisi2[i]	;
			else 
				ToplamGunSayisi =ToplamGunSayisi + AydakiGunSayisi1[i];
		
		System.out.print(yil + "yılının " + ay +".ayının" + gun +".günü için :");
		System.out.println("Geçen toplam gün sayısı = " +ToplamGunSayisi);
	}

}
