package JavaD2HW2;

public class ProductManager {
	public void Add(Product product) {
		// JDBC 
		System.out.println("�r�n eklendi "+ product.getName());
	}
	
	public void Add2(int id, String name, String description, int stockAmount, double price) { 
		// Overloading olmamas� i�in Add2() yaz�ld� ama Add() olarak kalabilirdi. 
		// Add2(i�ini doldurmak) Kullan�m olarak hatal�d�r. 
	}
}
