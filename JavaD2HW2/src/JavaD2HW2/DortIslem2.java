package JavaD2HW2;

public class DortIslem2 {
	public int Topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	// ikisine de topla dersek hata olmaz. Parametrelerinin imzası farklı. 
	// İlkinde int int istiyor, ikincisinde int int int gerekiyor.
	// Buna da overloading deniyor.  
	
	public int Topla2(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2;
	}
	
}
