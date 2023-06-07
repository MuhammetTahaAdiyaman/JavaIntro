package classesWithAttributes;

public class Product {
	//burada ise constructor method bahsedelim. Başlangıçta bir değer atamak için kullanırız.
	public Product() {
		System.out.println("Yapıcı Blok Çalıştı");
	}
	//biz main içinde bu class'ı tanımladığımız da new lediğimiz anda bu yapı çalışacaktır.
	//ayrıyeten parametreli constructor da kullanabiliriz o zaman newlediğimiz yerde parantez içine burada belirttiğimiz parametre değerlerini girilmesi gerekmektedir.
	
	
	
	//Product manager demedim. ProductManager yönetiyor listeliyor ekliyor siliyor güncelliyor yani adı üstünde
	//ürünün özelliği ne diye sorsak adı laptop modeli şu şu kadar ağırlıkta şu fiyatta söyleriz.
	//bir class aynı zamanda özellik attribute barındırır.
	private int id;
	private String name;
	private String describtion;
	private double price;
	private int stockAmount;
	//biz bu noktada ürüne ait bilgileri vermiş olduk.
	//bunlara attribute veya field denir.
	
	
	//şimdi gelelim encapsulation olayına.
	//yukarıdaki gibi kullanımda public oluyor bu özelliklere her yerden erişilebilir durumda oluyor.
	//eğer biz bunu private olarak ayarlasaydık sadece tanımlandığı class içinde ulaşılabilir oluyoruz.
	//peki biz main fonk. içinden nasıl değer ataması gerçekleştireceğiz işte burada encapsulation konularından en önemlisi getter ve setter noktasına gelmiş bulunmaktayız.
	//get ve set metodları public olarak yapılmalıdır get değer okuma set ise atamadır.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//şimdi diğerlerini de ekleyelim.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
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
	
	//şimdi main içinden atamalarını set metodu ile yapalım.
}
