package JavaD2HW2;

public class Methods {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n have �ok g�zel";
		String yeniMesaj = mesaj.substring(0,2); // sehirVer() kullan�labilirdi. ��nk� ikisi de string.
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7); // topla() kullan�labilmesinin nedeni int de�er d�nmesinden.
							// toplama yapt�rmak i�in iki parametre vermek gerek. Toplama i�lemi yapmaz. 
		System.out.println(sayi);
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
	
	public static int topla(int sayi1, int sayi2) { // int t�r�nde de�er d�nd�r�r - Toplama i�in topla() i�ine int de�erler verilmeli.
		//return 5; // burada 5 d�nd�r demek. - Parametre verildikten sonra da sayi1 + sayi2 yaz�l�r.
		return sayi1+sayi2;
	}
	
	public static String sehirVer() {
		return Ankara;
	}
}
