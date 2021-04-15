package day02;

import java.util.Scanner;

public class Soru06 {
public static void main(String[] args) {
	//kullanicidan bir kelime isteyin eger kelime 3 ve daha fazla harften olusuyorsa
	//son 2 harfini 3 kere yan yana yazdirin. degilse girilen kelimeyi yazdirin
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir kelime girin");
	String kelime=scan.next();
	
	String sonUcHarf=kelime.substring(kelime.length()-2);
	
	if (kelime.length()>=3) {
		System.out.println(sonUcHarf+sonUcHarf+sonUcHarf);
	}else {
		System.out.println(kelime);
	}
	scan.close();
}
}
