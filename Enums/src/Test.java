
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(Aylar.Aralýk);
		
		 DortIslem toplama = DortIslem.Topla;
	     System.out.println("25+25= "+toplama.sonuc(25,25));
	     
	     DortIslem modalma = DortIslem.Mod;
	     System.out.println("12 mod 5 = "+modalma.sonuc(12, 5));
	     
	     DortIslem üshesapla = DortIslem.Usalma;
	     System.out.println("3 üzeri 4 = "+üshesapla.sonuc(3, 4));
	     
	 
	     Gunler monday = Gunler.Pazartesi;
	     System.out.println(monday);
	     
	    
	}

}
