package methods;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		
		int aranacak = 6;
		
		boolean varMi = false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		/*
		if(varMi == true) {
			System.out.println("Sayi mevcuttur");
		}else {
			System.out.println("Sayi mevcut değildir.");
		}
		*/
		
		//şimdi methodları biz kodlamada DRY prensibinden dolayı kullanırız.
		//bu prensibin ismi Do Not Repeat Yourself dir. Kendini tekrarlama.
		//bu hem clean code hem de kodun perfornmansı açısından önemlidir.
		//bundan dolayı bir kez yazdığın kodu farklı farklı yerlerde çağırmak her zaman daha efektif bunun için de methodlara başvururuz.
		//yukarıda aslında son ekrana bastıracak sayi mevcuttur cümlesini hadi gelin method ile oluşturup çağıralım.
		
		//Not: javada method isimleri camelCase şeklinde yazılır.
		
		//şimdi metodumuzu deneyelim.
		mesajVer(varMi,6);
		//biz bu metodu 6 farklı sayfada da çağırabilirdik.
		mesajVer(varMi,6);
		mesajVer(varMi,6);
		mesajVer(varMi,6);
		mesajVer(varMi,6);
		//bu şekilde hem kod kalabalığından hem de DRY prensibine uyum sağlamış oluruz.
		

	}
	
	public static void mesajVer(boolean var, int deger) {
		if(var == true) {
			System.out.println("Sayi mevcuttur: "+deger);
		}else {
			System.out.println("Sayi mevcut değildir: "+deger);
		}
	}
}
