package JavaD2HW2;

public class Methods {

	public static void main(String[] args) {
		
		String mesaj = "Bugün have çok güzel";
		String yeniMesaj = mesaj.substring(0,2); // sehirVer() kullanýlabilirdi. Çünkü ikisi de string.
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7); // topla() kullanýlabilmesinin nedeni int deðer dönmesinden.
							// toplama yaptýrmak için iki parametre vermek gerek. Toplama iþlemi yapmaz. 
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6); // Sayýlarý diziye çaviriyor. 
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Guncellendi");
		return; // bitir demek. Fonksiyon devam ettirme demek. 
	}
	
	public static int topla(int sayi1, int sayi2) { // int türünde deðer döndürür - Toplama için topla() içine int deðerler verilmeli.
		//return 5; // burada 5 döndür demek. - Parametre verildikten sonra da sayi1 + sayi2 yazýlýr.
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) { // int den sonra 3 tane nokta ekledil. Variable Arguments deniyor. 

		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		
		return toplam;
	}
	
	public static String sehirVer() {
		return Ankara;
	}
}
