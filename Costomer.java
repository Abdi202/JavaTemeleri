
public class Costomer {

	
	private String firstName;
	private String e_postAdres;
	private String telphone;
	
	public  Costomer(String firstName, String e_postAdres,String telphone) {
		
		this.firstName =firstName;
		this.e_postAdres =e_postAdres;
		this.telphone =telphone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getE_postAdres() {
		return e_postAdres;
	}

	public void setE_postAdres(String e_postAdres) {
		this.e_postAdres = e_postAdres;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	
	
	
}
