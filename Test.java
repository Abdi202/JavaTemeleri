
public class Test {
	
public static void main(String[] args) {
		
   CostomerAccount account =new CostomerAccount("kerim","Hassan","Bartin Merkez",1000);
	account.setAdi("Ali");
//    System.out.println(account.getAdi()+" "+ account.getSoyad());
    
      account.bilgiGosteran();
      
     
  Transaction transaction=new Transaction("Hulya","Abdi","Ankra merkz",500,"12/13/2023");
      
         transaction.islemDetayiniGoster();
}

		
	}
	