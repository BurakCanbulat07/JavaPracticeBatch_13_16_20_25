package day01;

import java.util.Scanner;

public class Soru05 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("4 basamakli bir sayi girin");
	int sayi= scan.nextInt();
	//1234
	int birlerBsm= sayi%10;//1234-4
	sayi /=10;//123
	int onlarBsm= sayi%10;//123-3
	sayi /=10;//12
	int yuzlerBsm= sayi%10;//12-2
	sayi/=10;//1
	int binlerBsm= sayi;//1
	
	int toplam=(binlerBsm+yuzlerBsm+onlarBsm+birlerBsm);
	
	if (toplam>=1&&toplam<=36) {
		System.out.println("Sayinin basamaklari toplami: "+(toplam));
	}else {
		System.out.println("sayi 4 basamakli degil '-'");
	}
	scan.close();
}
}
