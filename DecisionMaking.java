import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
//		String  isik ="Kimizi";
//		
//		switch(isik){
//		case "yasil":
//			System.out.print("Gidebilirsin");
//			break;
//		case "sari":
//			System.out.print("yavasla");
//			break;
//		
//		 default:
//			 System.out.print("dur");
//		}
//		
//		char Cinsiyet ='M';
//		
//		if(Cinsiyet=='M') {
//			System.out.println("Erkek");
//			
//		}else if(Cinsiyet=='F'){
//			
//			System.out.println("Kadin");
//			
//		} else {
//			System.out.println("Yanlis tusla");
//			
//			
//		}
//		
//		double 	siparisTutar =150.0;
//		double  indirimEsik =100.0;
//		double  indirimYuzde =0.1; //%10
//
//		if(siparisTutar>=indirimEsik) {
//		double indirimMiktar =siparisTutar*indirimYuzde;
//		double indrimliToplam =siparisTutar-indirimMiktar;
//		
//		System.out.println("indirimli Toplam: "+indrimliToplam);
//		
//		
//		}
//		else {
//	  System.out.println("Normal Toplam: "+ siparisTutar);	
//		}
		
        // Kullanıcıdan sınav notunu girmesini isteyin
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınav notunu girin: ");
        int sinavNotu = scanner.nextInt();
        
        // Sınav notunu değerlendirin ve sonucu ekrana yazdırın
        if (sinavNotu >= 50) {
            System.out.println("Başarılı");
        } else {
            System.out.println("Başarısız");
        }

        // Scanner nesnesini kapatın
        scanner.close();
    

        
        
        Scanner scannerOne = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scannerOne.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scannerOne.nextDouble();
        System.out.print("İşlem türünü seçin (+, -, *, /): ");
        char islemTuru = scannerOne.next().charAt(0);
        
        // İşlem türüne göre dört işlemi yapın ve sonucu ekrana yazdırın
        double sonuc = 0.0;

        switch (islemTuru) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                    return; // Programı sonlandır
                }
                break;
            default:
                System.out.println("Geçersiz işlem türü!");
                return; // Programı sonlandır
        }

        System.out.println("Sonuç: " + sonuc);

        // Scanner nesnesini kapatın
        scanner.close();
    
        
     // Kullanıcıdan 1 ile 7 arasında bir sayı girmesini isteyin
        Scanner scannerTwo = new Scanner(System.in);
        System.out.print("Lütfen 1 ile 7 arasında bir sayı girin: ");
        int sayi = scannerTwo.nextInt();
        
        // Sayıya karşılık gelen günü ekrana yazdırın
        String gun = "";

        switch (sayi) {
            case 1:
                gun = "Pazartesi";
                break;
            case 2:
                gun = "Salı";
                break;
            case 3:
                gun = "Çarşamba";
                break;
            case 4:
                gun = "Perşembe";
                break;
            case 5:
                gun = "Cuma";
                break;
            case 6:
                gun = "Cumartesi";
                break;
            case 7:
                gun = "Pazar";
                break;
            default:
                System.out.println("Geçersiz bir sayı girdiniz.");
                return; // Programı sonlandır
        }

        System.out.println("Girdiğiniz sayıya karşılık gelen gün: " + gun);

        // Scanner nesnesini kapatın
        scannerTwo.close();
        
        
        
        
        // Kullanıcıdan ürün fiyatını ve indirim yüzdesini girmesini isteyin
        Scanner scannerThree= new Scanner(System.in);
        System.out.print("Ürün fiyatını girin: ");
        double urunFiyati = scanner.nextDouble();
        System.out.print("İndirim yüzdesini girin (%): ");
        double indirimYuzdesi = scannerThree.nextDouble();
        
        // İndirimli fiyatı hesaplayın
        double indirimliFiyat = urunFiyati - (urunFiyati * (indirimYuzdesi / 100.0));

        // Sonucu ekrana yazdırın
        System.out.println("İndirimli fiyat: " + indirimliFiyat);

        // Scanner nesnesini kapatın
        scannerThree.close();
    }
		
		
	
	

}
