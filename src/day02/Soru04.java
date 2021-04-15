package day02;

import java.util.Scanner;

public class Soru04 {
public static void main(String[] args) {
	//girilen sayinin mutlak degerini yazdirin
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir sayi girin");
	double sayi=scan.nextDouble();
	
	if (sayi<0) {
		sayi= sayi*-1;
		System.out.println("Girilen sayinin mutlak degeri: "+sayi);
	} else {
		System.out.println("Girilen sayinin mutlak degeri: "+sayi);
	} 
	scan.close();
}
}
