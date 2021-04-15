package day04;

import java.util.Scanner;

public class Soru04 {
/*
 * Bir Stringin tersten ayni olup olmadigini bulunuz.  (Palindrom)
 *
 * ornek
 *  madam , nurses run  ==> palindromdur
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("String giriniz");
		String kelime=scan.nextLine().replace(" ","").toLowerCase();
	
		palindrom(kelime);
	scan.close();}
	
	public static void palindrom (String str) {				
		String strTers="";
		for(int i=str.length()-1;i>=0;i--) {
			strTers=strTers+str.charAt(i);
		}
		System.out.println(strTers);
		if(strTers.equals(str)) {
			System.out.println("Kelime palindromdur");
		}else {
			System.out.println("Kelime palindrom degildir");
		}
		
	}
}
