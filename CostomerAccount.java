
public class CostomerAccount {

	
	private String adi;
	private String soyad;
	private String adresi;
    private double hesapBakiye;
	
	
	

	
	public CostomerAccount(String adi, String soyad, String adresi, double hesapBakiye) {
		// TODO Auto-generated constructor stub
		this.adi =adi;
		this.soyad =soyad;
		this.adresi=adresi;
		this.hesapBakiye=hesapBakiye;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getAdresi() {
		return adresi;
	}

	public void setAdresi(String adresi) {
		this.adresi = adresi;
	}
	
	
	
	public double getHesapBakiye() {
		return hesapBakiye;
	}

	public void setHesapBakiye(double hesapBakiye) {
		this.hesapBakiye = hesapBakiye;
	}
	//hesap Bakiye Artirma
	
  public void hesapBakiyeArtirma(double miktar) {
	  hesapBakiye+=miktar;
  }
	
	  // Hesap bakiyesini azaltma metodu
	
	 public void hesapBakiyesiniAzalt(double miktar) {
		if(hesapBakiye >=miktar) {
			hesapBakiye-=miktar;
			
		}else {
			System.out.println("Yetersiz Bakiye");
		}
	 }
		

	
	//Bilgi Gorteran Method
	public void bilgiGosteran() {
		
		System.out.println("Adi: "+ adi);
		System.out.println("Soyad: "+soyad);
		System.out.println("Adress: "+ adresi);
		System.out.println("HesapBakiye: "+hesapBakiye);
	}
}
