package loopDemo;

public class Main {

	public static void main(String[] args) {

		//for
		/*
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü Bitti");
		*/
		
		//while 
		//while döngüsü de for döngüsü gibi belli şartı sağlayana kadar işlem yapmaya devam eder.
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");

	}

}
