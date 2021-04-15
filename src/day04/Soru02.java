package day04;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
		 *
		 * input      output
		 * axyzm  ==   true
		 * xyz    ==   true
		 * x.yz   ==   false
		 * xyaz   ==   false
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kelime giriniz");
		String kelime=scan.next();
		
		method(kelime);
		
	scan.close();}
	
	public static void method(String kelime) {
	boolean kontrol=kelime.contains("xyz");
	
	System.out.println(kontrol);
	}
}
