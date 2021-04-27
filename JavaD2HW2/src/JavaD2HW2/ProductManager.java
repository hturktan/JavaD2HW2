package JavaD2HW2;

public class ProductManager {
	public void Add(Product product) {
		// JDBC 
		System.out.println("Ürün eklendi "+ product.getName());
	}
	
	public void Add2(int id, String name, String description, int stockAmount, double price) { 
		// Overloading olmamasý için Add2() yazýldý ama Add() olarak kalabilirdi. 
		// Add2(içini doldurmak) Kullaným olarak hatalýdýr. 
	}
}
