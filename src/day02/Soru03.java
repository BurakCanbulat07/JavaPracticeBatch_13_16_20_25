package day02;

import java.util.Scanner;

public class Soru03 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen 3 sayi girin");
	double sayi1=scan.nextDouble();
	double sayi2=scan.nextDouble();
	double sayi3=scan.nextDouble();
	
	if (sayi1>sayi2&&sayi1>sayi3) {
		System.out.println("Buyuk sayi: "+sayi1);
		if (sayi2>sayi3) {
			System.out.println("Kucuk sayi: "+sayi3);
		}else if (sayi3>sayi2) {
			System.out.println("Kucuk sayi: "+sayi2);
		}else {
			System.out.println("Kalan sayilar esit");
		}
	} else if (sayi2>sayi1&&sayi2>sayi3) {
		System.out.println("Buyuk sayi: "+sayi2);
		if (sayi1>sayi3) {
			System.out.println("Kucuk sayi: "+sayi3);
		}else if (sayi3>sayi1) {
			System.out.println("Kucuk sayi: "+sayi1);
		}else {
			System.out.println("Kalan sayilar esit");
		}} else if (sayi3>sayi1&&sayi3>sayi2) {
			System.out.println("Buyuk sayi: "+sayi3);
			if (sayi2>sayi1) {
				System.out.println("Kucuk sayi: "+sayi1);
			}else if (sayi1>sayi2) {
				System.out.println("Kucuk sayi: "+sayi2);
			}else {
				System.out.println("Kalan sayilar esit");
			}}else {
				System.out.println("Sayilar esit");
			}
	scan.close();
}}
