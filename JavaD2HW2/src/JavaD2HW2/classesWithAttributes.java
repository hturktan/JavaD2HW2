package JavaD2HW2;

public class classesWithAttributes {

	public static void main(String[] args) {
		// class lar operasyonlarý (ortak) tutar. 
		// class lar özellik de tutar. (Field ya da attribute olarak da isimlendirilirler) 
		
		// attribute | field deniyor.
		
		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 3, "Siyah");
		// parametreli constructor kullanýlmýþ oluyor. 
		// Alttaki bilgilere gerek kalmýyor. 
		// Ama yine de onu da kullanmak istiyorsak. Product kýsmýnda tekrardan default constructor yazýlýr.
		// public Product() {} yazýlýrsa, alttaki kodlar kullanýlabilirdi. 
		// Ama buna da overloading denir. 
//		product.setName("Laptop");
//		//product.id = 1;
//		product.setId(1); // set den sonra bu þekilde yazýldý. Kullaným buna doðru deðiþti. 
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		//System.out.println(product.name); ihtiyaç ProductManager dan sonra gerek kalmadý.
		
		System.out.println(product.getKod());
		
		
	}

}
