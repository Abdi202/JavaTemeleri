

// Alt sınıf (Child sınıf) - Örnek bir işlem sınıfı
public class Transaction  extends CostomerAccount{
	
	private String islemTarihi;
     

	public String getIslemTarihi() {
		return islemTarihi;
	}

	public void setIslemTarihi(String islemTarihi) {
		this.islemTarihi = islemTarihi;
	}
	
	
	
	//iselem Detayini Gorster
	
	 public Transaction(String adi, String soyad, String adresi, double hesapBakiye, String islemTarihi
			) {
		  super(adi,soyad,adresi,hesapBakiye);
			this.islemTarihi =islemTarihi;   
		
			
	}


	public void islemDetayiniGoster() {
		System.out.println("Adi: "+getAdi());
		System.out.println("Soyad: "+getSoyad());
		System.out.println("adess: "+getAdresi());
		System.out.println("HesapBakiye: "+getHesapBakiye());
		System.out.println("IslemTarhi: "+ islemTarihi);
		
	}

}
