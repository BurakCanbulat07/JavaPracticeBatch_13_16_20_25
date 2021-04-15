package day01;

import java.util.Scanner;

public class Soru07 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Iki sayi giriniz");
	double sayi1= scan.nextDouble();
	double sayi2= scan.nextDouble();
	
	System.out.println("Lutfen 4 islemden birini secin \n1. Toplama \n2. Cikarma \n3. Carpma \n4. Bolme ");
	char islem =scan.next().charAt(0);
	
	if (islem=='1') {
		System.out.println(sayi1 + sayi2);
	} else if (islem=='2') {
		System.out.println(sayi1 - sayi2);
	}else if (islem=='3') {
		System.out.println(sayi1 * sayi2);
	}else if (islem=='4') {
		System.out.println(sayi1 / sayi2);
	} else {
		System.out.println("Lutfen 1 2 3 4 sayilarindan birini girdiginize emin olun");
	}
	
	scan.close();
}
}
