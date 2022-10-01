
public class Main {

	public static void main(String[] args) {
		
		DortIslem hesapMakine = new DortIslem();
		int sonuc= hesapMakine.Toplam(5, 15);
				System.out.println(sonuc);
		hesapMakine.Toplam(5, 15);
		
		hesapMakine.Cikarma(25, 10);
		int sonuc1= hesapMakine.Cikarma(25, 10);
		System.out.println(sonuc1);
		hesapMakine.Carp(5, 5);
		
		hesapMakine.Bol(15, 3);
		
		
		
	}

}
