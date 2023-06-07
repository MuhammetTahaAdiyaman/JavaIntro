
public class Main {

	public static void main(String[] args) {
		//bir hesap makinesi uygulaması yapalım.
		//şimdi DortIslem class'ımızı tanımlayalım.
		
		DortIslem dortIslem = new DortIslem();
		int sonuc1 = dortIslem.Topla(6, 5);
		int sonuc2 = dortIslem.Cikar(20,12);
		int sonuc3 = dortIslem.Carp(5, 4);
		int sonuc4 = dortIslem.Bol(12, 6);
		
		System.out.println(sonuc1);
		System.out.println(sonuc2);
		System.out.println(sonuc3);
		System.out.println(sonuc4);


	}
}