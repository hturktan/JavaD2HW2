package JavaD2HW2;

public class Classes {

	public static void main(String[] args) {
		// class lar reference type dir. 
		CustomerManager customerManager = new CustomerManager(); // class �a��r�m �ekli. 
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; // Referans numaras� customerMananger2 ile ayn� oldu. Garbage Collector Heap deki belle�i siler. 
		customerManager.Add(); 
		customerManager.Remove();
		customerManager.Update();
		
		// value - de�er tip. Stack i�inde �al���r. 
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
	
		// Diziler, reference type dir. 
		int[] sayilar1 = new int[] {1,2,3}; // int[] sayilar1 = {1,2,3} de olur.
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}

}




