package JavaD2HW2;

public class classesWithAttributes {

	public static void main(String[] args) {
		// class lar operasyonlar� (ortak) tutar. 
		// class lar �zellik de tutar. (Field ya da attribute olarak da isimlendirilirler) 
		
		// attribute | field deniyor.
		
		Product product = new Product();
		product.setName("Laptop");
		//product.id = 1;
		product.setId(1); // set den sonra bu �ekilde yaz�ld�. Kullan�m buna do�ru de�i�ti. 
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		//System.out.println(product.name); ihtiya� ProductManager dan sonra gerek kalmad�.
		
		System.out.println(product.getKod());
		
		
	}

}
