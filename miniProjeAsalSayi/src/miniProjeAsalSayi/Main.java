package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 11;
		
		int remainder = number % 2;
		
		boolean isPrime = true;
		
		for(int i=2; i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime == true) {
			System.out.println("Sayi Asaldir.");
		}else {
			System.out.println("Sayi Asal Değildir.");

		}
		
	}

}
