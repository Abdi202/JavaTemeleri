import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

  System.out.println("Operators");
  
   //Aritmetik Operators
  int numOne =10;
  int numTwo=5;
  
  int sum =numOne+numTwo;
  int difrent =numOne-numTwo;
  int product =numOne*numTwo;
  int remainder =numOne/numTwo;
   int quotient =numOne/numTwo;
  System.out.println("Toplam: "+sum);
  System.out.println("Fark: "+difrent);
  System.out.println("Carpim: "+product);
  System.out.println("Kalan: "+remainder);
  System.out.println("Bolme: "+quotient);
  
  System.out.println("-------------------------------------");
  //karsilastirma Operatorler
  
  boolean isEqual =numOne==numTwo;
  boolean isGreater =numOne>numTwo;
  boolean isLessOrEqual =numOne<=numTwo;
  
  System.out.println("isEqual Mi?: "+isEqual);
  System.out.println("Buyuk Mu?"+isGreater);
  System.out.println("Kucuk Veya Esit Mi: "+isLessOrEqual);
  
  // Mantiksal Opera----
  
  boolean isTrue =true;
  boolean isFalse =false;
  
  
//  boolean andResult =isTrue && isFalse;
  boolean andResult =5>2 && 5==5;
  
  boolean orResult =isTrue || isFalse;
  boolean notResult =!isTrue; 
  
  
  
  System.out.println("Mantiksal ve Sonuc: "+andResult);
  System.out.println("Mantiksal veya Sonuc "+ orResult);
  System.out.println("Mantiksal Degil sinuc "+notResult);
  
  
  
  Scanner scanner = new Scanner(System.in);

  // Kullanıcıdan üçgenin taban uzunluğunu ve yüksekliğini alın
  System.out.print("Üçgenin taban uzunluğunu girin: ");
  double taban = scanner.nextDouble();

  System.out.print("Üçgenin yüksekliğini girin: ");
  double yukseklik = scanner.nextDouble();

  // Alanı hesaplayın
  double alan = (taban * yukseklik) / 2;

  // Sonucu ekrana yazdırın
  System.out.println("Üçgenin alanı: " + alan);

  // Scanner nesnesini kapatın
  scanner.close();
  
  System.out.print("----------------------------------------");
//Kullanıcıdan bir sayı girmesini isteyin
  Scanner scanner2 = new Scanner(System.in);
  System.out.print("Bir sayı girin: ");
  int sayi = scanner2.nextInt();
  
  // Sayının pozitif, negatif veya sıfır olduğunu kontrol edin
  if (sayi > 0) {
      System.out.println("Girdiğiniz sayı pozitif.");
  } else if (sayi < 0) {
      System.out.println("Girdiğiniz sayı negatif.");
  } else {
      System.out.println("Girdiğiniz sayı sıfır.");
  }

  // Scanner nesnesini kapatın
  scanner2.close();

  
  
  System.out.print("---------------------------------");
  
  // Doğru kullanıcı adı ve şifreyi tanımlayın
  String dogruKullaniciAdi = "kullanici";
  String dogruSifre = "sifre";

  // Kullanıcıdan kullanıcı adı ve şifreyi isteyin
  Scanner scanner1 = new Scanner(System.in);
  System.out.print("Kullanıcı Adı: ");
  String kullaniciAdi = scanner.nextLine();
  System.out.print("Şifre: ");
  String sifre = scanner1.nextLine();

  // Kullanıcı adı ve şifre doğru mu kontrol edin
  if (kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre)) {
      System.out.println("Giriş Başarılı");
  } else {
      System.out.println("Hatalı Giriş");
  }

  // Scanner nesnesini kapatın
  scanner1.close();
}
}
	


