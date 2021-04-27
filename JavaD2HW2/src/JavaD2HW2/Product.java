package JavaD2HW2;

// En baþtan baþlar isek, private gerek yok. 
// Saða týkla, Source gir. Generate Getter and Setter ten Encapsulate týkla. 
// Hepsini seç. Onayla. 
public class Product {
	// ProductManager yönetiyor, ekle ya da sil gibi. 
	// Product ise ürüne özeldir. Ürünü anlatan özellikler ekran boyutu, RAM gibi. 
	
	//Constructor: her class ta vardýr. Default olarak bulunur. Arzu edilirse, yenilenebilir. 
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		// Product(içi doldurulursa main içinde çaðrýldýðýnda, içine bilgileri ister)
		System.out.println("Constructor çalýþtý.");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
		// this eklenerek, alttaki private kýsmýndakileri set etmiþ olduk. 
		// Hata vermesinin nedeni, name set deðildi. this ile set oldu. 
		
	}
	
	private int id; // ürünü tanýmlayan eþsiz deðer. 2 isim ayný olabilir ama TC onlarý ayýrýr. 
	private String name;
	private String description;
	private double price; 
	private int stockAmount;
	private String renk;
	private String kod; 
	
	// Ürün içinde bu þekilde alanlar tanýmladýðýmýzda public olarak iþaretlemiþ oluyoruz. Heryerden ulaþýlabilir.
	// Public int id; gibi yazýlýr. 
	// private int id; yazýlýrsa: tanýmlandýðý blokta geçerlidir. Yani product bloðu. 
	// If içinde olsaydý, if içinde geçerli olacaktý. 
	
	// private olduðu için getter ve setter ile baþka yerden de ulaþýlabilir. 
	
	// getter
	public int getId() {
		return id; 
	}
	
	// setter 
	public void setId(int id) { // set edilen deðer parametre olarak verilmeli. 
		// this.id = id; // this bulunduðum class demek. 
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

	// id yazýlarak düzeltildi, diðerlerini düzeltmek içinse :
	// _name de sað klik yapýldý. Source a gelindi, Generate Get ve Set kýsmýnda, Encapsulate fields özelliðine týklanýr. 
	// Tablo gelecek ve encapsulate olmasý istenilen yerler tek tek seçilir. 
	// Get ve Set de verilen isimler deðiþtirilebilir. 
	// getaccess ve setaccess týklý. 
	// encapsulate kýsýmlar private olacak diyor. 
	// bizim istediðimiz kýsým ise public olmasý. 
	 * 
	 */
}
