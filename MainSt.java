import java.util.ArrayList;

public class MainSt {

	public static void main(String[] args) {
	
		ArrayList<Integer> notlar =new ArrayList<Integer>();
		
		  notlar.add(69);
		  notlar.add(877);
		  notlar.add(34);
		  notlar.add(87);
		  
		  Student studnet =new Student();
		  
		  // sinif ortalam Notu Hesaplayin
		 double ortlam= Student.oratlamHesap(notlar);
		  
		  System.out.print(" sinifa Ortlama Not: "+ ortlam);
		

	}
	
	// Ortalama Hesapla method
//	 public static double oratlamHesap(ArrayList<Integer> notlar) {
//			
//		  int toplamNot =0;
//		  
//		  for(int not:notlar) {
//			  
//			  toplamNot+=not;
//		  }
//		  
//		  
//		  return  toplamNot/notlar.size();
//	  }
	 

}
