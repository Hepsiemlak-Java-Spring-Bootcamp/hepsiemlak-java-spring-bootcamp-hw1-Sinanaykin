/*Soru 2
Java da çoklu kalıtımın mümkün olmadığını belirttik.Bunun nedenini araştırın,olması durumunda nasıl bir problem oluşacağını kod yazarak anlatın.Hangi diller bu duruma izin veriyor ve bu durumu nasıl sağlıyor?Bu durumu Java da OOP prensipleriyle sağlayabilir miyiz??Evet ise nasıl?(Anlatımınız  içinde örnek kodların bulunması sade ve net anlaşılır olması alacağınız puanı etkileyecektir.)
Cevap:
Çoklu kalıtımı destekleyen diller bir sınıfın birden fazla sınıftan türemesine imkan tanırlar. Ancak Java ‘da bu olmaz.
Aşağıda bir kalıtım örneği mevcuttur;
public class Memeli
{
    public void Beslen()
    { 
    }    public void Ure()
    {
    }

}

Memeli sınıfımızda memelilerin temel davranışlarını tanımlayan Beslenme, Üreme gibi methodlar var.
public class Kedi : Memeli
{
public void AgacaTırman()
{
}
}

Kedi sınıfımız doğal olarak Memeli sınıfından türemekte, ayrıca Kedilere has bir davranış olan Ağaca Tırmanma özelliğinede sahip.
Şu noktaya kadar herşey normal, sıradan  bir kalıtım örneği. Senaryomuza bir ekleme yapalım ve kedinin aynı zamanda bir evcil hayvan olduğunuda bildiğimizden dolayı şu şekilde bir değişiklik yapalım ;

public class EvcilHayvan
{
    public void OyunOyna()
    {
    }
}public class Kedi : Memeli, EvcilHayvan
{
    public void AgacaTırman()
    {
    }
}

Görüldüğü üzere kedi sınıfımız şuan hem Memeli özelliklerine hemde Evcil Hayvan olmanın özelliklerini bünyesinde barındırıyor.


Java, C# gibi dillerde bildiğiniz üzere bu şekilde çoklu kalıtım yapamıyoruz.Çünkü çok kolay bir şekilde Single Responsibility prensibini ihlal edebiliriz, bir sınıfa birden fazla sınıfın davranışlarını eklemek bu kuralın ihlaline yol açabilir. Ama çoklu kalıtım ile ilgili en büyük sıkıntı Diamond Problem.

Diamond Problem:
 

Yandaki şekil üzerinden gidersek eğer. A sınıfından türemiş B ve C sınıfları var. Aynı zamanda D sınıfı hem B hem C sınıflarından türemiş. Şimdi bu durumda şöyle bir senaryo üzerinden gidelim. B ve C sınıfları A sınıfındaki bir methodu override ederek kullanıyorlar. Peki böyle bir durumda D sınıfı A sınıfındaki aynı method’u override etmeden kullanmaya çalışırsa ne olur B’nin override’ı mı C’nin override’ı mı çalışır? İşte bu noktada ortaya çıkan muğlaklığa Diamond Problem deniyor (kalıtım ağacının şekil itibariylede elması andırmasından dolayı).


Bazı diller çoklu kalıtıma izin veriyor. C++, Perl, Python, Lisp gibi.
Çoklu kalıtımı destekleyen C++, Perl, Python, Lisp gibi dillerin konuyla alakalı olaraktan çoklu kalıtım sağlamak amacıyla çeşitli çözümleri ve best practice’leri var.

Örneğin Python;


Python, C3 doğrusallaştırma (veya Yöntem Çözünürlük Sırası (MRO)) algoritmasını kullanarak bir sınıf listesi oluşturur . Bu algoritma iki kısıtlamayı zorunlu kılar: çocuklar ebeveynlerinden önce gelir ve bir sınıf birden fazla sınıftan miras alırsa, bunlar temel sınıfların demetinde belirtilen sırada tutulur ancak bu durumda, miras grafiğinde yüksek olan bazı sınıflar, alt sınıflardan önce gelebilir.Böylece, yöntem çözümleme sırası şöyledir: D, B, C, A. [11]
C++ çoklu kalıtım oluyor ama hangi sınıfın hangi method'unu çağırmak istediğinizi bizzat kendiniz vermeniz gerekmekte. C++ çoklu kalıtıma bu şekilde bir çözüm bulmuş.


Java da çoklu kalıtımı Object Oriented prensipleriyle sağlayabiliriz.Java çoklu kalıtımı interfaceler üzerinden destekler.
İnterface’ler içerisinde davranışsal olarak herangi bir kod barındırmayan sadece belli method signature’larını barındıran yapılar. O bir sınıfı aynı method imza’sına sahip n tane interface’den türetsek de implementasyonunu yapmamız gereken bir tane method olduğundan dolayı herangi bir sıkıntıyla karşılaşmıyoruz.

Örnek ile açıklayacak olursak ;
package interfaces;
	

	public class Arayuzler {
	    
	    public static void main(String[] args) {
	        
	        Kopekler kopek = new Kopekler();   
	        kopek.yemekYe();
	        
	    }
	    
	}
	
	interface Hayvanlar{
	    
	    void yemekYe();
	    
	}
	
	interface Memeliler{
	    
	    void ure();
	

	}
	
	class Kopekler implements Hayvanlar,Memeliler{
	

	    @Override
	    public void yemekYe() {
	        System.out.println("Et Ye");
	    }
	

	    @Override
	    public void ure() {
	        //
	    }
	    
	}
	*/
