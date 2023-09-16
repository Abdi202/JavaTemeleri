import java.util.HashMap;
import java.util.Map;

public class rezervasyon {

	public static void main(String[] args) {
		
		
		Map<Integer,Boolean> rezervasyon=new HashMap<Integer,Boolean>();
		
		
		     rezervasyon.put(101, false);  //101 oda numarali bos
		     rezervasyon.put(103, true); // 103  oda numarali rezervasyon edilmis
		     rezervasyon.put(104, false);
		     rezervasyon.put(105, true);
		     
		     
		     // Oda Sorgulama Icin
		     
		     int sorgulamaOda =103;
		     
		     Boolean rezervasyonDurumu =rezervasyon.get(sorgulamaOda);
	
		      // ekran Yazdirmak
		     
		     if(rezervasyonDurumu) {
		    	 System.out.println(sorgulamaOda+" bu numarali Oda edilmis");
		     }
		     else {
		    	
		    	 System.out.println(sorgulamaOda+" bu numarali Oda bos");
		     }
	}

}
