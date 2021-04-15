package day02;

public class Soru02 {
public static void main(String[] args) {
	/* Auto widening  ve Explicit narrowing ornekleri olusturunuz
	 * increment ve decrement ornekleri olusturunuz
	 * iki variable olusturun ve matematik operatorlerini kullanarak dort islem ve mod
	 * islemlerini yapiniz
	 */
	
	//AUTO WIDENING
	System.out.println("AUTO WIDENING");
	int sayi = 6;
	System.out.println("Sayinin int hali: "+sayi);
	double sayi2 = sayi;
	System.out.println("Sayinin double hali: "+sayi2);
	System.out.println("====================================================================================================================================================================================================================================");
	
	//EXPLICIT NARROWING
	System.out.println("EXPLICIT NARROWING");
	double sayi3 = 4.5;
	System.out.println("Sayinin double hali: "+sayi3);
	int sayi4= (int)sayi3;
	System.out.println("Sayinin int hali: "+sayi4);
	System.out.println("====================================================================================================================================================================================================================================");
	
	//Increment
	System.out.println("Increment");
	int i = 20;
	System.out.println("Orjinal: "+i);
	i = i+20;
	System.out.println("i=i+20: "+i);
	i +=20;
	System.out.println("i +=20: "+i);
	i++;
	System.out.println("i++: "+i);
	System.out.println("====================================================================================================================================================================================================================================");
	
	//Decrement
	System.out.println("Decrement");
	short s = 60;
	System.out.println("Orjinal: "+s);
	s = (short) (s-20);
	System.out.println("s=s-20: "+s);
	s -=20;
	System.out.println("s -=20: "+s);
	s--;
	System.out.println("s--: "+s);
	System.out.println("====================================================================================================================================================================================================================================");
	
	//Islemler
	System.out.println("Islemler");
	int x=10;
	int y=5;
	
	System.out.println("X: "+x);
	System.out.println("Y: "+y);
	
	int toplama= x+y;
	int cikarma= x-y;
	int carpma= x*y;
	int bolme= x/y;
	
	System.out.println("Toplama: "+toplama);
	System.out.println("Cikarma: "+cikarma);
	System.out.println("Carpma: "+carpma);
	System.out.println("Bolme: "+bolme);
	System.out.println("====================================================================================================================================================================================================================================");
	
	System.out.println("Modulus");
	System.out.println("12'nin 5'e bolumunden kalan: "+(12%5));
}
}
