package recapDemo1;

public class Main {

	public static void main(String[] args) {
//elimizdeki 3 sayıyı kıyaslayan program yazalım.
		int sayi1=266;
		int sayi2=25;
		int sayi3=13;
		int enBuyukSayi = sayi1;
		if(enBuyukSayi < sayi2) {
			enBuyukSayi = sayi2;
		}else if(enBuyukSayi < sayi3) {
			enBuyukSayi = sayi3;
		}
		
		System.out.println("En Büyük Sayi: " + enBuyukSayi);
	}

}
