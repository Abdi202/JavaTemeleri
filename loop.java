import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
//        while(countWhile<5) {
//        	System.out.println("while Dongu adim: "+countWhile);
//        	countWhile++;
//        }
        
//		int countWhile=0;
//        do {
//        	System.out.println("while Dongu adim: "+countWhile);
//         	countWhile++;
//        }
//        while(countWhile<5);
		

		        Scanner scanner = new Scanner(System.in);
		        
		        while (true) {
		            // Kullanıcıdan bir tam sayı alın
		            System.out.print("Çarpım tablosu için bir tam sayı girin veya çıkmak için -1 girin: ");
		            int sayi = scanner.nextInt();
		            
		            // Kullanıcı çıkmak istiyorsa programı sonlandırın
		            if (sayi == -1) {
		                System.out.println("Program sonlandırılıyor...");
		                break;
		            }
		            
		            // Çarpım tablosunu oluşturun ve ekrana yazdırın
		            for (int i = 1; i <= sayi; i++) {
		                for (int j = 1; j <= sayi; j++) {
		                    int carpim = i * j;
		                    System.out.print(carpim + "\t"); // \t ile aralık bırakın
		                }
		                System.out.println(); // Bir satırın sonunda yeni bir satıra geçin
		            }
		        }
		        
		        // Scanner nesnesini kapatın
		        scanner.close();
		    }
		

    }
	


