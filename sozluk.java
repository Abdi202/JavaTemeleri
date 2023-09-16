import java.util.HashMap;
import java.util.Map;

public class sozluk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> sozluk =new HashMap<String,String>();
		
		
		 sozluk.put("Computer", "Bilgisayar");
		 sozluk.put("Car", "Araba");
		 sozluk.put("muse", "fare");
		 sozluk.put("English", "ingilisce");
//		 for(Map.Entry<String, String> dic:sozluk.entrySet()) {
//			 System.out.println("Sozluk: "+ dic.getKey()+"->" +dic.getValue());
//		 }
		 
		 //sozluk Sorgulama
		 
		   String sorgulamSozluk ="English";
		   
		   String ceviri = sozluk.get(sorgulamSozluk);
		   
		   
	        // Sonucu ekrana yazdırın

				   
		 if(ceviri!=null) {
			 System.out.print("Kelimenin ceviri: "+ceviri);
			 
		 }    
		 else {
			 System.out.println("Kelimenin ceviri Bulanamadi");
		 }
		 
	}

}
