package variableArguments;

public class Main {

	public static void main(String[] args) {
		//şimdi biz bir tane topla metodu yazalım iki tane paremetre alsın. return method olsun.
		//şimdi biz bunu bir çağıralım.
		
		int sonuc = topla(5,7);
		System.out.println(sonuc);
		
		//şimdi biz 12 sonucunu aldık 2 sayı verdik.
		//şimdi bir hesap makinesi düşün arka arka bir çok sayı toplayabiliriz.
		//ama bizim metodumuz sadece 2 parametre almaktadır. Peki ben bunu istenilen kadar sayı gönderilecek hale getirebilir miyim ?
		
		//evet variable argumentsler ile çalışarak şimdi bir tane topla 2 metodu oluşturalım orada anlatalım.
		//şimdi çağıralım topla2 methodunu deneyelim 5 tane sayı verelim.
		
		int sonuc2 = topla2(3,4,5,6,7,8);
		System.out.println("Topla2: " + sonuc2);
		//variable arguments sıklıkla kullanılan bir yapıdır ama
		//aslına bakarsanız pek fazla tavsiye etmiyorum
		//bunun yerine koleksiyonlar veya nesnel yapıları tercih ediyorum.
		//şu anda int gönderiyoruz biz parametre olarak yarın bir gün nesneler ile çalışacağız ve nesneler için ne gönderdiği belli olmadığı için test edilebilirliği zayıflıyor bu tip yapıların.
		//
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {
		//değişkenden sonra ... koyuyoruz.
		//bunu bir array olarak algıladığı için biz toplamı for döngüsü ile döndürmemiz gerek.
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam = toplam+sayi;
		}
		return toplam;
	}
}
