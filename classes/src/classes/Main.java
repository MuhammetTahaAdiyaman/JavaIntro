package classes;

public class Main {

	public static void main(String[] args) {
		//classların en altın kuralı gruplama yapmaktır.
		//bir alışveriş sisteminde ürünleri listeleriz sileriz ekleriz güncelleriz bunların hepsi ayrı ayrı nesneler.
		//düşünsenize tüm her şeyi main class içine yazdığımızı .koyduğunuzda 8bin operasyon gelecek.
		//şimdi bir class oluşturalım.
		//NOT: JAVAda class oluşturma PascalCase şeklindedir.
		
		
		//CustomerManager class'ı oluşturduk şimdi çağıralım.
		//şimdi normalde biz bir değişkeni nasıl tanımlıyoruz? int sayi;
		//aynı şekilde class'ı da tanımlamamız gerek hemen yapalım.
		CustomerManager customerManager = new CustomerManager();
		//belleğimizde CustomerManager türünde bir nesne üretmiş olduk.
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		//tanımladığımız metodlar buraya da gelmiş oluyor.
		//ürün ekleme, müşteri ekleme, kart ekleme hepsini ayrı ayrı gruplamış oluyoruz.
		
		
		
		
		
		//şimdi değer tip ve referans tip olayını biraz daha anlayalım.
		//en alt kısımda referans tip örneğini verdim şimdi değer tiplerden bahsedelim bir örnek üzerinden.
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2=sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		//yukarıdaki ekrana ne basacak.
		/*
		  neden 10 geldi. Biz dersimizin başlarındad primitive type'lardan bahsettik int float double şeklinde
		  bu tipler değer tiplerdir.
		  Peki değer tipler nasıl çalışıyor ?
		  Belleğimizde 2 yer var biri stack diğeri ise heap bellek.
		  biz değer tip ile bir şey tanımladığımızda heap ile alakası yok herşey stack de oluşuyor.
		  stack:
		  sayi1=10 oldu
		  değeri hemen yanında oldu. daha sonra
		  sayi2 = 20 dedik.
		  sonra dedik ki
		  sayi2 = sayi1
		  artık bellek şöyle oldu
		  sayi1=10
		  sayi2=10
		  daha sonra yeni bir şey daha tanımladık sayi1 = 30 bellek son durumda
		  sayi1=30
		  sayi2=10
		  
		*/
	}

}

//şimdi gelelim biz class tanımlaması yaparken neden "new className();" yapıyoruz.
/* class'lar referans tiptir. Bellekte 2 tane alan var bunların biri stack diğeri ise heap
 * şimdi ben "CustomerManager customerManager" yazdığım zaman solda olan stack bellekte bir yer ayırmış oluyor.
 * new CustomerManager() dediğimiz anda sağ da bulunan heap bellekte CustomerManager nesnesi oluşuyor. Yani
 * stack bellekte olan customerManager değişkeni bir referans numarası alıyor 101 adında aslında o 101 numara new'lediğimiz heap olan
 * bellekteki nesnenin adresi olmuş oluyor.
 * peki ne oldu ?
 * şimdi bizim oluşturduğumuz customerManager nesnesi 101 tutuyordu
 * yeni bir tane daha oluşturduk diyelim customerManager2 adında o da bellekte ayrı olarak 102 alanını tuttu
 * ikisinde de ayrı ayrı alanları tutuyor
 * ancak biz şunu dersek "customerManager = customerManager2" işte burada şu oluyor
 * stack bellekteki customerManager ve customerManager2 artık 102 numaralı yere ait olmuş oluyor.
 * yani customerManager2 nin referans numarası customerManager'ın referans numarasına eşit oldu.
 * 101 referans numaralı alan bellekte duruyor ona ne olacak ?
 * eğer onun referansını tutan bir değişken veya nesne yoksa garbage collector onu bellekten siliyor.*/
 