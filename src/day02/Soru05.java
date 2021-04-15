package day02;

import java.util.Scanner;

public class Soru05 {
public static void main(String[] args) {
	/*
	 * ornek
	 *  Kullanici  : A , B , C harflerinden birini secsin
		 A'yi secmis ise, ==> Java is easy
		 B'yi secmis ise, ==> Java is fun
		 C'yi secmis ise, ==> I need to study :)
	 */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen A/B/C harflerinden birini girin");
	char harf=scan.next().toUpperCase().charAt(0);
	
	if (harf=='A') {
		System.out.println("Java is easy");
	} else if (harf=='B') {
		System.out.println("Java is fun");
	} else if (harf=='C') {
		System.out.println("I need to study");
	} else {
		System.out.println("A/B/C harflerinden birini girmelisiniz");
	}
	scan.close();
}
}
