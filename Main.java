import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Costomer> costomer =new ArrayList<Costomer>();
		
		Costomer musteri1=new Costomer("Ali","Ali@gmail.com","2333333");
		
		Costomer musteri2=new Costomer("kerim","kerim@gmail.com","8777665555");
		
		  costomer.add(musteri1);
		  costomer.add(musteri2);
		  
		  
		  for(Costomer musteri:costomer) {
			  System.out.println("Musteri Adi: "+musteri.getFirstName());
			  System.out.println("Musteri Telphone: "+musteri.getTelphone());
			  System.out.println("Musteri e_posta: "+musteri.getE_postAdres());
			  
		  }
		 
		 
	}

}
