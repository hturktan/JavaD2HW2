package JavaD2HW2;

// En ba�tan ba�lar isek, private gerek yok. 
// Sa�a t�kla, Source gir. Generate Getter and Setter ten Encapsulate t�kla. 
// Hepsini se�. Onayla. 
public class Product {
	// ProductManager y�netiyor, ekle ya da sil gibi. 
	// Product ise �r�ne �zeldir. �r�n� anlatan �zellikler ekran boyutu, RAM gibi. 
	
	//Constructor: her class ta vard�r. Default olarak bulunur. Arzu edilirse, yenilenebilir. 
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		// Product(i�i doldurulursa main i�inde �a�r�ld���nda, i�ine bilgileri ister)
		System.out.println("Constructor �al��t�.");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
		// this eklenerek, alttaki private k�sm�ndakileri set etmi� olduk. 
		// Hata vermesinin nedeni, name set de�ildi. this ile set oldu. 
		
	}
	
	private int id; // �r�n� tan�mlayan e�siz de�er. 2 isim ayn� olabilir ama TC onlar� ay�r�r. 
	private String name;
	private String description;
	private double price; 
	private int stockAmount;
	private String renk;
	private String kod; 
	
	// �r�n i�inde bu �ekilde alanlar tan�mlad���m�zda public olarak i�aretlemi� oluyoruz. Heryerden ula��labilir.
	// Public int id; gibi yaz�l�r. 
	// private int id; yaz�l�rsa: tan�mland��� blokta ge�erlidir. Yani product blo�u. 
	// If i�inde olsayd�, if i�inde ge�erli olacakt�. 
	
	// private oldu�u i�in getter ve setter ile ba�ka yerden de ula��labilir. 
	
	// getter
	public int getId() {
		return id; 
	}
	
	// setter 
	public void setId(int id) { // set edilen de�er parametre olarak verilmeli. 
		// this.id = id; // this bulundu�um class demek. 
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		//return kod;
		return this.name.substring(0,1) + id;
	}

	public void setKod(String kod) {
		this.kod = kod; 
	}
	
	
	
	
/*
	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public String get_kod() {
		return _kod;
	}

	public void set_kod(String _kod) {
		this._kod = _kod;
	}

	// id yaz�larak d�zeltildi, di�erlerini d�zeltmek i�inse :
	// _name de sa� klik yap�ld�. Source a gelindi, Generate Get ve Set k�sm�nda, Encapsulate fields �zelli�ine t�klan�r. 
	// Tablo gelecek ve encapsulate olmas� istenilen yerler tek tek se�ilir. 
	// Get ve Set de verilen isimler de�i�tirilebilir. 
	// getaccess ve setaccess t�kl�. 
	// encapsulate k�s�mlar private olacak diyor. 
	// bizim istedi�imiz k�s�m ise public olmas�. 
	 * 
	 */
}
