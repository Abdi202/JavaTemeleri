import java.util.ArrayList;

public class Student {

	 public static double oratlamHesap(ArrayList<Integer> notlar) {
			
		  int toplamNot =0;
		  
		  for(int not:notlar) {
			  
			  toplamNot+=not;
		  }
		  
		  
		  return  toplamNot/notlar.size();
	  }
}
