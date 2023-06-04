package arraysDemo;

public class Main {

	public static void main(String[] args) {
		//hatalı kullanım sonrası neden diziye ihtiyaç var görelim.
		/*
		String ogrenci1 = "ahmet";
		String ogrenci2 = "mehmet";
		String ogrenci3 = "ali";
		String ogrenci4 = "veli";
		String ogrenci5 = "veysel";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println(ogrenci5);
		*/
		//bu şekilde yapmak yerine;
		//new tarafına girmiyoruz şimdilik kaç elemandan oluştuğu belirtmemiz olarak algılayalım.
		String[] ogrenciler = new String[5];
		ogrenciler[0] = "ahmet";
		ogrenciler[1] = "mehmet";
		ogrenciler[2] = "ali";
		ogrenciler[3] = "veli";
		ogrenciler[4] = "veysel";
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		
		//diğer bir for kullanımı ise
		//bu kullanım foreach kullanımına benzer
		//ogrenciler dizisinde olan her öğrenciyi tek tek gez şeklindedir.
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
