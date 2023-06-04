package variables;

public class main {

	public static void main(String[] args) {
		// Java Case Sensetive bir dildir.ü
		//değişkenleri neden kullanırız ?
		//aşağıda öğrenci sayısı 10 olduğunda 4 yerde de değiştirmemiz gerek bu da bir külfet
		//bunun yerine değişken tanımlayıp tek bir yerde değiştirmemiz daha mantıklıdır.
		
		/*System.out.println("öğrenci sayisi: 9");
		System.out.println("öğrenci sayisi: 9");
		System.out.println("öğrenci sayisi: 9");
		System.out.println("öğrenci sayisi: 9");*/
		
		//NOT: Değişken isimleri camelCase şeklinde tutulmalıdır.
		int ogrenciSayisi = 11;
		//yukarıdaki gibi yapacağımıza şu şekilde yapmamız daha kolay olacaktır. Tek bir yerden değişimi sağlatabiliriz.
		System.out.println("Öğrenci Sayisi: " + ogrenciSayisi);
		System.out.println("Öğrenci Sayisi: " + ogrenciSayisi);
		System.out.println("Öğrenci Sayisi: " + ogrenciSayisi);
		System.out.println("Öğrenci Sayisi: " + ogrenciSayisi);

		//tek bir yerden değişimi de kolaylaşmaktadır.
		//reusabiility = tekrar kullanılabilirlik önemlidir. Bir kez yaz tekrar kullan.
		//yukarıdaki kodda öğrenci sayısı metni de tekrar kullanılmış onu da düzenleyelim
		
		System.out.println("****");
		String mesaj = "Öğrenci Sayisi: ";
		System.out.println(mesaj+ ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
	}

}
