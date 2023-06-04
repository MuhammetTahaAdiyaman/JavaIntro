package conditionals;

public class Main {

	public static void main(String[] args) {
		int sayi = 20;
		/*
		if(sayi < 20) {
			
			System.out.println("Sayi 20'den küçüktür.");
		}
		
		if(sayi < 15) {
			System.out.println("Sayi 15'den küçüktür.");

		}
		*/
		//yukarıdaki iki durumu da sağladığı için iki durum da çalışacaktır.
		/*
		if(sayi < 20) {
			
			System.out.println("Sayi 20'den küçüktür.");
		}else{
			System.out.println("Sayi 20'den küçük değildir.");

		}
		*/
		//burada da iki durum kıyaslaması yapılmaktadır. Ya ilk blok ya ikini blok çalışmaktadır.
		//ikisinden biri mutlaka çalışmak zorundadır.
		//üçüncü durumsa eşit durumunda ise else if kullanılır.
		
		if(sayi < 20) {
			
			System.out.println("Sayi 20'den küçüktür.");
		}else if(sayi==20){
			System.out.println("Sayi 20'ye eşittir.");

		}else{
			System.out.println("Sayi 20'den küçük değildir.");

		}
	}

}
