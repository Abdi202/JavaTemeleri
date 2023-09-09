
public class DataType {

	public static void main(String[] args) {
		String Isim ;
		Isim ="Kerim";
//		System.out.print("Isim"+Isim);
		
		
		int x =10;
		{
			int y =20; // global 
			System.out.println("x" +x);
			System.out.println("y" +y);
		}
		x=20; // erisibiliriz Main method icinde oldu icin
		
	//	System.out.println("y"+y); // global oldu icin buraya erismaz
		int dogumTarihi =2000;
		int simdikiTarihi=2023;
//		int hesaplamaYaz=simdikiTarihi-dogumTarihi;
		System.out.print("hesaplamaYaz:"+(simdikiTarihi-dogumTarihi));
		
		System.out.println("1"+"1"); //Concantenation:birletirme
		System.out.println(1+1);
		
	}
}
