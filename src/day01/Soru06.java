package day01;

import java.util.Scanner;

public class Soru06 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Ara notu giriniz");
	double araNot= scan.nextDouble();
	System.out.println("Proje notunuzu giriniz");
	double proNot=scan.nextDouble();
	System.out.println("Final notunuzu giriniz");
	double finNot=scan.nextDouble();
	
	araNot*=0.30;
	proNot*=0.20;
	finNot*=0.50;
	double genelNot=araNot+proNot+finNot;
	
	System.out.println("Genel sinav notunuz: "+(genelNot));
	
	scan.close();
}
}