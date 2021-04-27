package JavaD2HW2;

public class classesWithAttributes {

	public static void main(String[] args) {
		// class lar operasyonlarý (ortak) tutar. 
		// class lar özellik de tutar. (Field ya da attribute olarak da isimlendirilirler) 
		
		// attribute | field deniyor.
		
		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		//System.out.println(product.name); ihtiyaç ProductManager dan sonra gerek kalmadý.
		
		// 
	}

}
