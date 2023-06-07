package inheritanceDemo;

public class KrediUI {
//manager da yazdığımız kodları arayüzde çağırırız.
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		System.out.println("Kredi Hesaplandı.");
	}
}

//neden basekredimanager parametre verdim çünkü tüm krediler için tek tek parametre vermek yerine 
//kredilerin inherit aldığı basekredimanager verdiğimde main içinden hepsine ulaşım sağlayacağım zaten.