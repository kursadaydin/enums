
public enum DortIslem {
	
	Topla   { double sonuc(double sayi1, double sayi2) { return sayi1 + sayi2; } },
    Cikar   { double sonuc(double sayi1, double sayi2) { return sayi1 - sayi2; } },
    Carp   { double sonuc(double sayi1, double sayi2) { return sayi1 * sayi2; } },
    Bol   { double sonuc(double sayi1, double sayi2) { return sayi1 / sayi2; } },
    Mod {double sonuc(double sayi1, double sayi2){return sayi1%sayi2; } },
    Usalma {double sonuc (double sayi1,double sayi2) 
    { 
    	int sonuc =1;
    	for (int i = 0; i < sayi2; i++) {
		sonuc *=sayi1;
	}
    	return sonuc; }};
    	
    	
    
    abstract double sonuc(double sayi1, double sayi2);
    
}


