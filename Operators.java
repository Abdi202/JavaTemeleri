
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
	}

}
