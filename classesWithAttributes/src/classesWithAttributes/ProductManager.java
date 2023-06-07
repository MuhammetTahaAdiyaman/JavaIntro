package classesWithAttributes;

public class ProductManager {
	//şimdi ise ürün yönetimi için farklı bir sınıf oluşturduk. parametre olarak Product yollayacağız.
	
	public void Add(Product product) {
		System.out.println("Ürün eklendi " + product.name);
	}
	
	//şimdi main içinde çağıralım.
}
