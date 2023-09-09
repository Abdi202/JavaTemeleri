
public class TypeCasting {

	public static void main(String[] args) {
//		//		Primativ 
//		//Tip Donusumu ve Donusum
//		// iki Tip donusum explicit type and Implicit
//		int numOne =10;
//		double numTwo =3.4;
//		
//		double result =numOne+numTwo;//Implicit type converstion java Kandisi yapiyor
//		
//		
//		System.out.println("result: "+result);
//		
//		//Tip Donusumu ve Donusum
//		int numThree=15;
//		int numFour=7;
//		
//		double quotient =(double)numThree/numFour;
//		System.out.println("quotient: "+quotient);
//		
//	//Non Primativ
//	
//		//Ilker Olmayaz Tip Donusum
////		int>string
//		int number =10;
//		String  strNumber=Integer.toString(number);
//		
//		System.out.println("Integer: "+number);
//		System.out.println("String: "+strNumber);
//		
//		//String>int
//		
//		String str ="4322";
//		
//		int numberStr =Integer.parseInt(str);
//		
//		System.out.println("String: "+str);
//		System.out.println("Integer: "+numberStr);
		
		        int tamsayi = 42;
		        double ondalikli = tamsayi; // Otomatik tip dönüşümü (widening)

		        System.out.println("Tamsayi: " + tamsayi);
		        System.out.println("Ondalikli: " + ondalikli);
		        
		        double ondalikliOne = 42.75;
		        int tamsayiOne = (int) ondalikli; // Zorunlu tip dönüşümü (narrowing)

		        System.out.println("Ondalikli: " + ondalikliOne);
		        System.out.println("Tamsayi: " + tamsayiOne);

		        
		        String sayiIfadesi = "123";

		        // Integer wrapper sınıfı kullanarak string ifadeyi tamsayıya dönüştürün
		        Integer tamsayiTwo = Integer.parseInt(sayiIfadesi);

		        System.out.println("String ifade: " + sayiIfadesi);
		        System.out.println("Tamsayi: " + tamsayiTwo);
		    }
		
	}


