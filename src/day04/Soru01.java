package day04;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
		 * return eden metod yaziniz
		 *
		 * ornek
		 * input  elma  2
		 *        army  3
		 *
		 * output  eaea
		 *         ayayay
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Kelime giriniz");
		String kelime=scan.next();
		System.out.println("Sayi giriniz");
		int sayi=scan.nextInt();
		
		method(kelime,sayi);
		
		
	scan.close();}
	
	public static void method(String kelime, int sayi) {
		for(int i=1;i<=sayi;i++) {
		System.out.print(""+kelime.charAt(0)+kelime.charAt(kelime.length()-1));
		}
	}
}
