package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		/*
		product.id = 1;
		product.name = "Laptop";
		product.describtion = "Asus laptop";
		product.price = 5000;
		product.stockAmount = 3;
		*/
		//private olduğu için set metodu ile atayalım.
		product.setId(1);
		product.setDescribtion("Asus Laptop");
		product.setName("Laptop");
		product.setPrice(5000);
		product.setStockAmount(2);
		//şimdi get metodu ile okutalım
		
		System.out.println(product.getName());
		
		
		//ürün yönetimini kullanalım. bakalım bizim nesnemiz olan laptop'u sisteme eklesin.
		
		/*ProductManager productManager = new ProductManager();
		productManager.Add(product);*/
		
		
		//yazılım geliştirme prensibi olarak Single responsibility'e göre bir class sadece bir işi bir method sadece bir işi yapar.
		//yani biz Product class'ı içinde add metodu eklememeliyiz bunun için ayrı bir class oluşturmalıyırz ProductManager şeklinde.
		
	}

}
